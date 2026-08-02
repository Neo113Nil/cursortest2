package androidx.media3.common.util;

import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public abstract class Log {
    public static final Object lock = new Object();
    public static ExecutorService staticInstance;

    public static String appendThrowableString(String str, Throwable th) {
        String replace;
        if (th != null) {
            synchronized (lock) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        replace = android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th2 = th2.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, "\n  ");
        m108m.append(replace.replace("\n", "\n  "));
        m108m.append('\n');
        return m108m.toString();
    }

    public static void bindTexture(int i, int i2) {
        GLES20.glBindTexture(i, i2);
        checkGlError();
        GLES20.glTexParameteri(i, 10240, 9729);
        checkGlError();
        GLES20.glTexParameteri(i, 10241, 9729);
        checkGlError();
        GLES20.glTexParameteri(i, 10242, 33071);
        checkGlError();
        GLES20.glTexParameteri(i, 10243, 33071);
        checkGlError();
    }

    public static void checkGlError() {
        StringBuilder sb = new StringBuilder();
        DimensionKt.checkNonnegative(4, "initialCapacity");
        Object[] objArr = new Object[4];
        boolean z = false;
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = Recorder$$ExternalSyntheticOutline1.m(glGetError, new StringBuilder("error code: 0x"));
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            Integer valueOf = Integer.valueOf(glGetError);
            int i2 = i + 1;
            int expandedCapacity = ImmutableCollection.ArrayBasedBuilder.expandedCapacity(objArr.length, i2);
            if (expandedCapacity > objArr.length) {
                objArr = Arrays.copyOf(objArr, expandedCapacity);
            }
            objArr[i] = valueOf;
            z = true;
            i = i2;
        }
        if (z) {
            throw new GlUtil$GlException(sb.toString(), ImmutableList.asImmutableList(i, objArr));
        }
    }

    public static void checkGlException(String str, boolean z) {
        if (z) {
            return;
        }
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        throw new GlUtil$GlException(str, RegularImmutableList.EMPTY);
    }

    public static FloatBuffer createBuffer(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Format createFormatFromMediaFormat(MediaFormat mediaFormat) {
        byte[] bArr;
        String string2;
        Format format2;
        int i;
        int i2;
        byte[] bArr2;
        Format.Builder builder = new Format.Builder();
        builder.sampleMimeType = MimeTypes.normalizeMimeType(mediaFormat.getString("mime"));
        builder.language = mediaFormat.getString("language");
        builder.peakBitrate = mediaFormat.containsKey("max-bitrate") ? mediaFormat.getInteger("max-bitrate") : -1;
        builder.averageBitrate = mediaFormat.containsKey("bitrate") ? mediaFormat.getInteger("bitrate") : -1;
        int i3 = 0;
        if (Objects.equals(mediaFormat.getString("mime"), "video/3gpp") && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) {
            int integer = mediaFormat.getInteger("profile");
            int integer2 = mediaFormat.getInteger("level");
            byte[] bArr3 = CodecSpecificDataUtil.NAL_START_CODE;
            String str = Util.DEVICE_DEBUG_INFO;
            Locale locale = Locale.US;
            string2 = Recorder$$ExternalSyntheticOutline2.m("s263.", integer, integer2, ".");
            bArr = null;
        } else if (Objects.equals(mediaFormat.getString("mime"), "video/dolby-vision") && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) {
            int integer3 = mediaFormat.getInteger("profile");
            byte[] bArr4 = CodecSpecificDataUtil.NAL_START_CODE;
            if (integer3 == 1) {
                format2 = 0;
                i = 0;
            } else if (integer3 == 2) {
                format2 = 0;
                i = 1;
            } else if (integer3 == 4) {
                format2 = 0;
                i = 2;
            } else if (integer3 != 8) {
                format2 = 0;
                format2 = 0;
                format2 = 0;
                format2 = 0;
                format2 = 0;
                format2 = 0;
                format2 = 0;
                if (integer3 == 16) {
                    i = 4;
                } else if (integer3 == 32) {
                    i = 5;
                } else if (integer3 == 64) {
                    i = 6;
                } else if (integer3 == 128) {
                    i = 7;
                } else if (integer3 == 256) {
                    i = 8;
                } else if (integer3 == 512) {
                    i = 9;
                } else {
                    if (integer3 != 1024) {
                        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(integer3, "Unknown Dolby Vision profile: "));
                        return null;
                    }
                    i = 10;
                }
            } else {
                format2 = 0;
                i = 3;
            }
            int integer4 = mediaFormat.getInteger("level");
            if (integer4 == 1) {
                i2 = 1;
            } else if (integer4 != 2) {
                switch (integer4) {
                    case 4:
                        i2 = 3;
                        break;
                    case 8:
                        i2 = 4;
                        break;
                    case 16:
                        i2 = 5;
                        break;
                    case 32:
                        i2 = 6;
                        break;
                    case 64:
                        i2 = 7;
                        break;
                    case 128:
                        i2 = 8;
                        break;
                    case 256:
                        i2 = 9;
                        break;
                    case 512:
                        i2 = 10;
                        break;
                    case 1024:
                        i2 = 11;
                        break;
                    case 2048:
                        i2 = 12;
                        break;
                    case 4096:
                        i2 = 13;
                        break;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(integer4, "Unknown Dolby Vision level: "));
                        return format2;
                }
            } else {
                i2 = 2;
            }
            if (i > 9) {
                Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str2 = Util.DEVICE_DEBUG_INFO;
                string2 = String.format(Locale.US, "dvh1.%02d.%02d", objArr);
                bArr = format2;
            } else if (i > 8) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str3 = Util.DEVICE_DEBUG_INFO;
                string2 = String.format(Locale.US, "dvav.%02d.%02d", objArr2);
                bArr = format2;
            } else {
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str4 = Util.DEVICE_DEBUG_INFO;
                string2 = String.format(Locale.US, "dvhe.%02d.%02d", objArr3);
                bArr = format2;
            }
        } else {
            bArr = null;
            bArr = null;
            string2 = mediaFormat.containsKey("codecs-string") ? mediaFormat.getString("codecs-string") : null;
        }
        builder.codecs = string2;
        builder.frameRate = !mediaFormat.containsKey("frame-rate") ? -1.0f : mediaFormat.getValueTypeForKey("frame-rate") == 3 ? mediaFormat.getFloat("frame-rate") : mediaFormat.getInteger("frame-rate");
        builder.width = mediaFormat.containsKey("width") ? mediaFormat.getInteger("width") : -1;
        builder.height = mediaFormat.containsKey("height") ? mediaFormat.getInteger("height") : -1;
        builder.pixelWidthHeightRatio = (mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) ? mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height") : 1.0f;
        builder.maxInputSize = mediaFormat.containsKey("max-input-size") ? mediaFormat.getInteger("max-input-size") : -1;
        builder.rotationDegrees = mediaFormat.containsKey("rotation-degrees") ? mediaFormat.getInteger("rotation-degrees") : 0;
        int integer5 = mediaFormat.containsKey("color-standard") ? mediaFormat.getInteger("color-standard") : -1;
        int integer6 = mediaFormat.containsKey("color-range") ? mediaFormat.getInteger("color-range") : -1;
        int integer7 = mediaFormat.containsKey("color-transfer") ? mediaFormat.getInteger("color-transfer") : -1;
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        if (byteBuffer != null) {
            byte[] bArr5 = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr5);
            bArr2 = bArr5;
        } else {
            bArr2 = bArr;
        }
        if (integer5 != 2 && integer5 != 1 && integer5 != 6 && integer5 != -1) {
            integer5 = -1;
        }
        if (integer6 != 2 && integer6 != 1 && integer6 != -1) {
            integer6 = -1;
        }
        if (integer7 != 1 && integer7 != 3 && integer7 != 2 && integer7 != 6 && integer7 != 7 && integer7 != -1) {
            integer7 = -1;
        }
        builder.colorInfo = (integer5 == -1 && integer6 == -1 && integer7 == -1 && bArr2 == null) ? bArr : new ColorInfo(integer5, integer6, integer7, -1, -1, bArr2);
        builder.sampleRate = mediaFormat.containsKey("sample-rate") ? mediaFormat.getInteger("sample-rate") : -1;
        builder.channelCount = mediaFormat.containsKey("channel-count") ? mediaFormat.getInteger("channel-count") : -1;
        builder.pcmEncoding = mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : -1;
        DimensionKt.checkNonnegative(4, "initialCapacity");
        Object[] objArr4 = new Object[4];
        int i4 = 0;
        while (true) {
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-" + i3);
            if (byteBuffer2 == null) {
                builder.initializationData = ImmutableList.asImmutableList(i4, objArr4);
                if (mediaFormat.containsKey("track-id")) {
                    builder.id = Integer.toString(mediaFormat.getInteger("track-id"));
                }
                return new Format(builder);
            }
            byte[] bArr6 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr6);
            byteBuffer2.rewind();
            int i5 = i4 + 1;
            int expandedCapacity = ImmutableCollection.ArrayBasedBuilder.expandedCapacity(objArr4.length, i5);
            if (expandedCapacity > objArr4.length) {
                objArr4 = Arrays.copyOf(objArr4, expandedCapacity);
            }
            objArr4[i4] = bArr6;
            i3++;
            i4 = i5;
        }
    }

    public static void d(String str, String str2) {
        synchronized (lock) {
            android.util.Log.d(str, appendThrowableString(str2, null));
        }
    }

    public static void e(String str, String str2) {
        synchronized (lock) {
            android.util.Log.e(str, appendThrowableString(str2, null));
        }
    }

    public static synchronized Executor get() {
        ExecutorService executorService;
        synchronized (Log.class) {
            try {
                if (staticInstance == null) {
                    String str = Util.DEVICE_DEBUG_INFO;
                    staticInstance = Executors.newSingleThreadExecutor(new Util$$ExternalSyntheticLambda0("ExoPlayer:BackgroundExecutor"));
                }
                executorService = staticInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static String getAttributeValue(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static void i(String str, String str2) {
        synchronized (lock) {
            android.util.Log.i(str, appendThrowableString(str2, null));
        }
    }

    public static boolean isEndTag(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean isExtensionSupported(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        checkGlException("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        checkGlException("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new GlUtil$GlException(Recorder$$ExternalSyntheticOutline1.m(eglGetError, new StringBuilder("Error in getDefaultEglDisplay, error code: 0x")), ImmutableList.of((Object) Integer.valueOf(eglGetError)));
        }
        String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    public static boolean isStartTag(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void maybeSetInteger(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void setCsdBuffers(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void w(String str, String str2) {
        synchronized (lock) {
            android.util.Log.w(str, appendThrowableString(str2, null));
        }
    }

    public static void e(String str, String str2, Throwable th) {
        synchronized (lock) {
            android.util.Log.e(str, appendThrowableString(str2, th));
        }
    }

    public static void w(String str, String str2, Throwable th) {
        synchronized (lock) {
            android.util.Log.w(str, appendThrowableString(str2, th));
        }
    }
}
