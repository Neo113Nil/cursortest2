package androidx.compose.ui.window;

import android.content.Intent;
import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.window.OnBackInvokedDispatcher;
import androidx.camera.camera2.compat.DynamicRangeProfilesCompatApi33Impl;
import androidx.camera.camera2.compat.DynamicRangeProfilesCompatBaseImpl;
import androidx.camera.camera2.internal.DynamicRangeConversions;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_AudioProfileProxy;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy;
import androidx.camera.video.Recorder;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidRenderEffect;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioCapabilities;
import com.google.common.collect.ImmutableList;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class Api33Impl {
    public static Unit $r8$lambda$QfF9dhx_o584Fcbkaksf8wwE4wg(RuntimeShader runtimeShader, float f, float f2, float f3, float f4, float f5, float f6, ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        reusableGraphicsLayerScope.getClass();
        runtimeShader.setFloatUniform("cellSize", reusableGraphicsLayerScope.graphicsDensity.getDensity() * f);
        runtimeShader.setFloatUniform("gap", f2);
        runtimeShader.setFloatUniform("cornerRadius", f3);
        runtimeShader.setFloatUniform("spread", f4);
        runtimeShader.setFloatUniform("time", f5);
        runtimeShader.setFloatUniform("twinkleSpeed", f6);
        RenderEffect createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShader, "contents");
        createRuntimeShaderEffect.getClass();
        reusableGraphicsLayerScope.setRenderEffect(new AndroidRenderEffect(createRuntimeShaderEffect));
        return Unit.INSTANCE;
    }

    public static AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy from(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new AutoValue_EncoderProfilesProxy_AudioProfileProxy(audioProfile.getMediaType(), audioProfile.getCodec(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new AutoValue_EncoderProfilesProxy_VideoProfileProxy(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), videoProfile.getBitDepth(), videoProfile.getChromaSubsampling(), videoProfile.getHdrFormat()));
        }
        return AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.create(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static Recorder.AnonymousClass6 fromCameraMetaData(CameraMetadata cameraMetadata) {
        cameraMetadata.getClass();
        int i = Build.VERSION.SDK_INT;
        Recorder.AnonymousClass6 anonymousClass6 = null;
        if (i >= 33) {
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
            key.getClass();
            DynamicRangeProfiles dynamicRangeProfiles = (DynamicRangeProfiles) ((Camera2CameraMetadata) cameraMetadata).get(key);
            if (dynamicRangeProfiles != null) {
                if (i < 33) {
                    Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher. is not supported on API ", " (requires API 33)"));
                    return null;
                }
                anonymousClass6 = new Recorder.AnonymousClass6(new DynamicRangeProfilesCompatApi33Impl(dynamicRangeProfiles), 6);
            }
        }
        return anonymousClass6 == null ? DynamicRangeProfilesCompatBaseImpl.COMPAT_INSTANCE : anonymousClass6;
    }

    public static AudioCapabilities getCapabilitiesInternalForDirectPlayback(AudioManager audioManager, AudioAttributes audioAttributes, ImmutableList immutableList, List list) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(audioAttributes.getPlatformAudioAttributes());
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(CompositeException.WrappedPrintStream.asList(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format2 = audioProfile.getFormat();
                if (Util.isEncodingLinearPcm(format2) || AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(Integer.valueOf(format2))) {
                    if (hashMap.containsKey(Integer.valueOf(format2))) {
                        Set set = (Set) hashMap.get(Integer.valueOf(format2));
                        set.getClass();
                        set.addAll(CompositeException.WrappedPrintStream.asList(audioProfile.getChannelMasks()));
                    } else {
                        hashMap.put(Integer.valueOf(format2), new HashSet(CompositeException.WrappedPrintStream.asList(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Map.Entry entry : hashMap.entrySet()) {
            builder.m2032add((Object) new AudioCapabilities.AudioProfile(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new AudioCapabilities(builder.build(), immutableList, list);
    }

    public static AudioDeviceInfo getDefaultRoutedDeviceForAttributes(AudioManager audioManager, AudioAttributes audioAttributes) {
        audioManager.getClass();
        List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(audioAttributes.getPlatformAudioAttributes());
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return audioDevicesForAttributes.get(0);
    }

    public static int getMaxItems$activity() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && (i < 30 || SdkExtensions.getExtensionVersion(30) < 2)) {
            return Integer.MAX_VALUE;
        }
        return MediaStore.getPickImagesMaxLimit();
    }

    public static Object getParcelableExtra(Intent intent, String str, Class cls) {
        return intent.getParcelableExtra(str, cls);
    }

    public static DynamicRange getRecommended10BitDynamicRange(CameraMetadata cameraMetadata) {
        cameraMetadata.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE;
        key.getClass();
        Long l = (Long) ((Camera2CameraMetadata) cameraMetadata).get(key);
        if (l != null) {
            return (DynamicRange) DynamicRangeConversions.PROFILE_TO_DR_MAP.get(l);
        }
        return null;
    }

    public static String getUniqueId(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean isTextSelectable(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void maybeRegisterBackCallback(PopupLayout popupLayout, Api33Impl$$ExternalSyntheticLambda0 api33Impl$$ExternalSyntheticLambda0) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (api33Impl$$ExternalSyntheticLambda0 == null || (findOnBackInvokedDispatcher = popupLayout.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, api33Impl$$ExternalSyntheticLambda0);
    }

    public static final void maybeUnregisterBackCallback(PopupLayout popupLayout, Api33Impl$$ExternalSyntheticLambda0 api33Impl$$ExternalSyntheticLambda0) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (api33Impl$$ExternalSyntheticLambda0 == null || (findOnBackInvokedDispatcher = popupLayout.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(api33Impl$$ExternalSyntheticLambda0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (r1.changed(r6) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        if (r1.changed(r9) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        if (r1.changed(r10) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        if (r1.changed(r11) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        if (r1.changed(r12) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
    
        r0 = r2 | r7;
        r2 = r1.rememberedValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
    
        if (r0 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        if (r2 != r3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ec, code lost:
    
        return androidx.compose.ui.graphics.ColorKt.graphicsLayer(r16, (kotlin.jvm.functions.Function1) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
    
        r7 = r6;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r4 = new com.squareup.cash.fidesmo.views.ScanningPulseShaderKt$$ExternalSyntheticLambda1(r5, r18, r7, r8, r9, r10, r11);
        r1.updateRememberedValue(r4);
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c7, code lost:
    
        if ((r24 & 1572864) != 1048576) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        if (r1.changed(r18) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0053  */
    /* renamed from: scanningPulseShader-osbwsH8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Modifier m1075scanningPulseShaderosbwsH8(Modifier modifier, float f, final float f2, float f3, float f4, float f5, float f6, Composer composer, int i) {
        boolean z;
        float f7;
        boolean z2;
        float f8;
        boolean z3;
        float f9;
        boolean z4;
        float f10;
        boolean z5;
        float f11;
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = new RuntimeShader("uniform shader contents;\nuniform float cellSize;\nuniform float gap;\nuniform float cornerRadius;\nuniform float spread;\nuniform float time;\nuniform float twinkleSpeed;\n\nhalf4 main(float2 fragCoord) {\n  float2 cellIndex = floor(fragCoord / cellSize);\n  if (mod(cellIndex.x + cellIndex.y, 2.0) >= 1.0) {\n    return half4(0.0, 0.0, 0.0, 0.0);\n  }\n\n  float2 cellCenter = (cellIndex + 0.5) * cellSize;\n  half4 sampled = contents.eval(cellCenter);\n\n  if (sampled.a < 0.01 && spread > 0.0) {\n    float h1 = fract(sin(dot(cellIndex, float2(127.1, 311.7))) * 43758.5453);\n    if (h1 < spread) {\n      float h2 = fract(sin(dot(cellIndex, float2(269.5, 183.3))) * 17351.3748);\n      float h3 = fract(sin(dot(cellIndex, float2(419.2, 371.9))) * 28456.3);\n      float angle = h2 * 6.2831853;\n      float dist = (h3 * spread * 3.0 + 1.0) * cellSize;\n      float2 nearbyCenter = cellCenter + float2(cos(angle), sin(angle)) * dist;\n      sampled = contents.eval(nearbyCenter);\n      if (sampled.a < 0.5) {\n        return half4(0.0, 0.0, 0.0, 0.0);\n      }\n    } else {\n      return half4(0.0, 0.0, 0.0, 0.0);\n    }\n  }\n\n  float halfDot = max(0.0, cellSize * 0.5 - gap * 0.5) * float(sampled.a);\n\n  if (twinkleSpeed > 0.0) {\n    float th1 = fract(sin(dot(cellIndex, float2(73.1, 251.7))) * 53758.5453);\n    float th2 = fract(sin(dot(cellIndex, float2(149.5, 113.3))) * 23351.3748);\n    float baseFreq = mix(0.5, 5.0, th1);\n    float tPhase = th2 * 6.2831853;\n    float wave = sin(time * baseFreq * twinkleSpeed + tPhase);\n    float raw = wave * 0.5 + 0.5;\n    float shimmer = 1.0 - twinkleSpeed * (1.0 - raw);\n    halfDot *= shimmer;\n  }\n\n  float r = halfDot * cornerRadius;\n  float2 q = abs(fragCoord - cellCenter) - halfDot + r;\n  float sdf = length(max(q, 0.0)) + min(max(q.x, q.y), 0.0) - r;\n\n  return sdf < 0.0 ? half4(sampled.rgb, 1.0) : half4(0.0, 0.0, 0.0, 0.0);\n}");
            gapComposer.updateRememberedValue(rememberedValue);
        }
        final RuntimeShader runtimeShader = (RuntimeShader) rememberedValue;
        boolean changedInstance = gapComposer.changedInstance(runtimeShader);
        boolean z6 = false;
        if (((i & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256) {
        }
        if ((i & MLKEMEngine.KyberPolyBytes) != 256) {
            z = false;
            boolean z7 = changedInstance | z;
            if (((i & 7168) ^ 3072) <= 2048) {
                f7 = f3;
            } else {
                f7 = f3;
            }
            if ((i & 3072) != 2048) {
                z2 = false;
                boolean z8 = z7 | z2;
                if (((57344 & i) ^ 24576) > 16384) {
                    f8 = f4;
                } else {
                    f8 = f4;
                }
                if ((i & 24576) != 16384) {
                    z3 = false;
                    boolean z9 = z8 | z3;
                    if (((458752 & i) ^ 196608) <= 131072) {
                        f9 = f5;
                    } else {
                        f9 = f5;
                    }
                    if ((196608 & i) != 131072) {
                        z4 = false;
                        boolean z10 = z9 | z4;
                        if (((i & 112) ^ 48) > 32) {
                            f10 = f;
                        } else {
                            f10 = f;
                        }
                        if ((i & 48) != 32) {
                            z5 = false;
                            boolean z11 = z10 | z5;
                            if (((3670016 & i) ^ 1572864) <= 1048576) {
                                f11 = f6;
                            } else {
                                f11 = f6;
                            }
                        }
                        z5 = true;
                        boolean z112 = z10 | z5;
                        if (((3670016 & i) ^ 1572864) <= 1048576) {
                        }
                    }
                    z4 = true;
                    boolean z102 = z9 | z4;
                    if (((i & 112) ^ 48) > 32) {
                    }
                    if ((i & 48) != 32) {
                    }
                    z5 = true;
                    boolean z1122 = z102 | z5;
                    if (((3670016 & i) ^ 1572864) <= 1048576) {
                    }
                }
                z3 = true;
                boolean z92 = z8 | z3;
                if (((458752 & i) ^ 196608) <= 131072) {
                }
                if ((196608 & i) != 131072) {
                }
                z4 = true;
                boolean z1022 = z92 | z4;
                if (((i & 112) ^ 48) > 32) {
                }
                if ((i & 48) != 32) {
                }
                z5 = true;
                boolean z11222 = z1022 | z5;
                if (((3670016 & i) ^ 1572864) <= 1048576) {
                }
            }
            z2 = true;
            boolean z82 = z7 | z2;
            if (((57344 & i) ^ 24576) > 16384) {
            }
            if ((i & 24576) != 16384) {
            }
            z3 = true;
            boolean z922 = z82 | z3;
            if (((458752 & i) ^ 196608) <= 131072) {
            }
            if ((196608 & i) != 131072) {
            }
            z4 = true;
            boolean z10222 = z922 | z4;
            if (((i & 112) ^ 48) > 32) {
            }
            if ((i & 48) != 32) {
            }
            z5 = true;
            boolean z112222 = z10222 | z5;
            if (((3670016 & i) ^ 1572864) <= 1048576) {
            }
        }
        z = true;
        boolean z72 = changedInstance | z;
        if (((i & 7168) ^ 3072) <= 2048) {
        }
        if ((i & 3072) != 2048) {
        }
        z2 = true;
        boolean z822 = z72 | z2;
        if (((57344 & i) ^ 24576) > 16384) {
        }
        if ((i & 24576) != 16384) {
        }
        z3 = true;
        boolean z9222 = z822 | z3;
        if (((458752 & i) ^ 196608) <= 131072) {
        }
        if ((196608 & i) != 131072) {
        }
        z4 = true;
        boolean z102222 = z9222 | z4;
        if (((i & 112) ^ 48) > 32) {
        }
        if ((i & 48) != 32) {
        }
        z5 = true;
        boolean z1122222 = z102222 | z5;
        if (((3670016 & i) ^ 1572864) <= 1048576) {
        }
    }

    public static final void setEditorBoundsInfo(CursorAnchorInfo.Builder builder, Rect rect) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(ColorKt.toAndroidRectF(rect)).setHandwritingBounds(ColorKt.toAndroidRectF(rect)).build());
    }
}
