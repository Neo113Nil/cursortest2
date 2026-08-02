package com.bugsnag.android;

import android.hardware.camera2.CameraAccessException;
import android.opengl.GLES20;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.pipe.InputRequest;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CaptureSequence;
import androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessor;
import androidx.camera.camera2.pipe.compat.ObjectUnavailableException;
import androidx.camera.camera2.pipe.graph.GraphRequestProcessorKt;
import androidx.camera.camera2.pipe.media.ImageWrapper;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_AudioProfileProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.MutableTagBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.audio.AutoValue_AudioSettings;
import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.collection.SieveCacheKt;
import androidx.collection.SparseArrayCompat;
import androidx.core.util.Supplier;
import androidx.gridlayout.widget.GridLayout;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.MpegAudioUtil$Header;
import androidx.media3.extractor.VorbisBitArray;
import androidx.media3.extractor.VorbisUtil$Mode;
import androidx.media3.extractor.ts.Ac3Reader;
import androidx.media3.extractor.ts.AdtsReader;
import androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory;
import androidx.media3.extractor.ts.DtsReader;
import androidx.media3.extractor.ts.H262Reader;
import androidx.media3.extractor.ts.H263Reader;
import androidx.media3.extractor.ts.H264Reader;
import androidx.media3.extractor.ts.H265Reader;
import androidx.media3.extractor.ts.Id3Reader;
import androidx.media3.extractor.ts.LatmReader;
import androidx.media3.extractor.ts.MpegAudioReader;
import androidx.media3.extractor.ts.MpeghReader;
import androidx.media3.extractor.ts.PesReader;
import androidx.media3.extractor.ts.SectionPayloadReader;
import androidx.media3.extractor.ts.SectionReader;
import androidx.media3.extractor.ts.SeiReader;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.media3.extractor.ts.TsPayloadReader;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.internal.NavDestinationImpl;
import androidx.navigation.internal.NavGraphImpl$iterator$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.GlideBuilder$1;
import com.caverock.androidsvg.SVG;
import com.google.android.libraries.places.internal.zzcjk;
import com.google.firebase.installations.remote.AutoValue_InstallationResponse;
import com.google.firebase.installations.remote.AutoValue_TokenResult;
import com.plaid.internal.EnumC0170g;
import com.squareup.workflow1.internal.SubtreeManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.UIntArray;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.atomicfu.AtomicBoolean;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicInt;
import okhttp3.internal.http1.HeadersReader;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.brotli.dec.HuffmanTreeGroup;
import papa.AppUpdateData;
import utils.StringUtilsKt;

/* loaded from: classes4.dex */
public final class TraceParser implements Supplier, SectionPayloadReader {
    public final /* synthetic */ int $r8$classId;
    public Object currentThread;
    public Object logger;
    public Object projectPackages;
    public int state;
    public Object threadAttrs;

    public TraceParser(String str, String str2) {
        this.$r8$classId = 6;
        int glCreateProgram = GLES20.glCreateProgram();
        this.state = glCreateProgram;
        Log.checkGlError();
        addShader(glCreateProgram, 35633, str);
        addShader(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        Log.checkGlException("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(glCreateProgram);
        this.threadAttrs = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.logger = new GlideBuilder$1[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.state;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
            String str3 = new String(bArr, 0, i3);
            GLES20.glGetAttribLocation(i2, str3);
            GlideBuilder$1 glideBuilder$1 = new GlideBuilder$1();
            ((GlideBuilder$1[]) this.logger)[i] = glideBuilder$1;
            ((HashMap) this.threadAttrs).put(str3, glideBuilder$1);
        }
        this.currentThread = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.state, 35718, iArr4, 0);
        this.projectPackages = new Transition.AnonymousClass1[iArr4[0]];
        for (int i5 = 0; i5 < iArr4[0]; i5++) {
            int i6 = this.state;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i6, 35719, iArr5, 0);
            int i7 = iArr5[0];
            byte[] bArr2 = new byte[i7];
            GLES20.glGetActiveUniform(i6, i5, i7, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                if (bArr2[i8] == 0) {
                    i7 = i8;
                    break;
                }
                i8++;
            }
            String str4 = new String(bArr2, 0, i7);
            GLES20.glGetUniformLocation(i6, str4);
            Transition.AnonymousClass1 anonymousClass1 = new Transition.AnonymousClass1();
            ((Transition.AnonymousClass1[]) this.projectPackages)[i5] = anonymousClass1;
            ((HashMap) this.currentThread).put(str4, anonymousClass1);
        }
        Log.checkGlError();
    }

    public static void addShader(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        Log.checkGlException(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        Log.checkGlError();
    }

    public void abortCaptures$camera_camera2_pipe() {
        List<Camera2CaptureSequence> list;
        synchronized (((ArrayList) this.currentThread)) {
            list = CollectionsKt.toList((ArrayList) this.currentThread);
            ((ArrayList) this.currentThread).clear();
        }
        for (Camera2CaptureSequence camera2CaptureSequence : list) {
            Trace.beginSection("InvokeInternalListeners");
            int size = camera2CaptureSequence.captureMetadataList.size();
            for (int i = 0; i < size; i++) {
                RequestMetadata requestMetadata = (RequestMetadata) camera2CaptureSequence.captureMetadataList.get(i);
                int size2 = camera2CaptureSequence.listeners.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((Request.Listener) camera2CaptureSequence.listeners.get(i2)).onAborted(requestMetadata.getRequest());
                }
            }
            Trace.endSection();
            Trace.beginSection("InvokeRequestListeners");
            int size3 = camera2CaptureSequence.captureMetadataList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                RequestMetadata requestMetadata2 = (RequestMetadata) camera2CaptureSequence.captureMetadataList.get(i3);
                int size4 = requestMetadata2.getRequest().listeners.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((Request.Listener) requestMetadata2.getRequest().listeners.get(i4)).onAborted(requestMetadata2.getRequest());
                }
            }
            Trace.endSection();
        }
        Camera2CaptureSequenceProcessor camera2CaptureSequenceProcessor = (Camera2CaptureSequenceProcessor) this.logger;
        synchronized (camera2CaptureSequenceProcessor.lock) {
            android.util.Log.d("CXCP", camera2CaptureSequenceProcessor + "#abortCaptures");
            camera2CaptureSequenceProcessor.session.abortCaptures();
        }
    }

    public void addAllCameraCaptureCallbacks(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            addCameraCaptureCallback((CameraCaptureCallback) it.next());
        }
    }

    public void addCameraCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
        ArrayList arrayList = (ArrayList) this.currentThread;
        if (arrayList.contains(cameraCaptureCallback)) {
            return;
        }
        arrayList.add(cameraCaptureCallback);
    }

    public void addDestination$navigation_common_release(NavDestination navDestination) {
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) this.projectPackages;
        NavGraph navGraph = (NavGraph) this.logger;
        NavDestinationImpl navDestinationImpl = ((NavDestination) navGraph).impl;
        navDestination.getClass();
        NavDestinationImpl navDestinationImpl2 = navDestination.impl;
        int i = navDestinationImpl2.id;
        String str = navDestinationImpl2.route;
        if (i == 0 && str == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            return;
        }
        String str2 = navDestinationImpl.route;
        if (str2 != null && Intrinsics.areEqual(str, str2)) {
            Path$$ExternalSyntheticBUOutline0.m$1("Destination ", navDestination, " cannot have the same route as graph ", navGraph);
            return;
        }
        if (i == navDestinationImpl.id) {
            Path$$ExternalSyntheticBUOutline0.m$1("Destination ", navDestination, " cannot have the same id as graph ", navGraph);
            return;
        }
        sparseArrayCompat.getClass();
        NavDestination navDestination2 = (NavDestination) SieveCacheKt.commonGet(sparseArrayCompat, i);
        if (navDestination2 == navDestination) {
            return;
        }
        if (navDestination.parent != null) {
            a$$ExternalSyntheticBUOutline0.m$1("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            return;
        }
        if (navDestination2 != null) {
            navDestination2.parent = null;
        }
        navDestination.parent = navGraph;
        sparseArrayCompat.put(navDestinationImpl2.id, navDestination);
    }

    public void addImplementationOptions(Config config) {
        for (AutoValue_Config_Option autoValue_Config_Option : config.listOptions()) {
            ((MutableOptionsBundle) this.projectPackages).retrieveOption(autoValue_Config_Option, null);
            ((MutableOptionsBundle) this.projectPackages).insertOption(autoValue_Config_Option, config.getOptionPriority(autoValue_Config_Option), config.retrieveOption(autoValue_Config_Option));
        }
    }

    public void addPoint(double d, float f) {
        int length = ((float[]) this.logger).length + 1;
        int binarySearch = Arrays.binarySearch((double[]) this.projectPackages, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.projectPackages = Arrays.copyOf((double[]) this.projectPackages, length);
        this.logger = Arrays.copyOf((float[]) this.logger, length);
        this.currentThread = new double[length];
        double[] dArr = (double[]) this.projectPackages;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        ((double[]) this.projectPackages)[binarySearch] = d;
        ((float[]) this.logger)[binarySearch] = f;
    }

    public void addView(View view, int i, boolean z) {
        RecyclerView recyclerView = RecyclerView.this;
        int childCount = i < 0 ? recyclerView.getChildCount() : getOffset(i);
        ((HeadersReader) this.projectPackages).insert(childCount, z);
        if (z) {
            hideViewInternal(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        RecyclerView.Adapter adapter = recyclerView.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        ArrayList arrayList = recyclerView.mOnChildAttachStateListeners;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((RecyclerView.OnChildAttachStateChangeListener) recyclerView.mOnChildAttachStateListeners.get(size)).onChildViewAttachedToWindow(view);
            }
        }
    }

    public void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = RecyclerView.this;
        int childCount = i < 0 ? recyclerView.getChildCount() : getOffset(i);
        ((HeadersReader) this.projectPackages).insert(childCount, z);
        if (z) {
            hideViewInternal(view);
        }
        RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt);
                Path$$ExternalSyntheticBUOutline0.m(sb, (Object) recyclerView.exceptionLabel());
                return;
            } else {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    android.util.Log.d("RecyclerView", "reAttach " + childViewHolderInt);
                }
                childViewHolderInt.clearTmpDetachFlag();
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String exceptionLabel = recyclerView.exceptionLabel();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(exceptionLabel);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public CaptureConfig build() {
        ArrayList arrayList = new ArrayList((HashSet) this.logger);
        OptionsBundle from = OptionsBundle.from((MutableOptionsBundle) this.projectPackages);
        int i = this.state;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.currentThread);
        MutableTagBundle mutableTagBundle = (MutableTagBundle) this.threadAttrs;
        TagBundle tagBundle = TagBundle.EMPTY_TAGBUNDLE;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : mutableTagBundle.mTagMap.keySet()) {
            arrayMap.put(str, mutableTagBundle.mTagMap.get(str));
        }
        return new CaptureConfig(arrayList, from, i, arrayList2, new TagBundle(arrayMap));
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021a  */
    @Override // androidx.media3.extractor.ts.SectionPayloadReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void consume(ParsableByteArray parsableByteArray) {
        SparseArray sparseArray;
        VorbisBitArray vorbisBitArray;
        int i;
        TsPayloadReader pesReader;
        TsPayloadReader pesReader2;
        int i2;
        SparseArray sparseArray2;
        SparseArray sparseArray3 = (SparseArray) this.projectPackages;
        SparseIntArray sparseIntArray = (SparseIntArray) this.currentThread;
        VorbisBitArray vorbisBitArray2 = (VorbisBitArray) this.logger;
        TsExtractor tsExtractor = (TsExtractor) this.threadAttrs;
        SparseArray sparseArray4 = tsExtractor.tsPayloadReaders;
        SparseBooleanArray sparseBooleanArray = tsExtractor.trackIds;
        if (parsableByteArray.readUnsignedByte() != 2) {
            return;
        }
        int i3 = 0;
        TimestampAdjuster timestampAdjuster = (TimestampAdjuster) tsExtractor.timestampAdjusters.get(0);
        if ((parsableByteArray.readUnsignedByte() & 128) == 0) {
            return;
        }
        parsableByteArray.skipBytes(1);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int i4 = 3;
        parsableByteArray.skipBytes(3);
        parsableByteArray.readBytes(0, 2, vorbisBitArray2.data);
        vorbisBitArray2.setPosition(0);
        vorbisBitArray2.skipBits(3);
        int i5 = 13;
        tsExtractor.pcrPid = vorbisBitArray2.readBits(13);
        parsableByteArray.readBytes(0, 2, vorbisBitArray2.data);
        vorbisBitArray2.setPosition(0);
        vorbisBitArray2.skipBits(4);
        parsableByteArray.skipBytes(vorbisBitArray2.readBits(12));
        sparseArray3.clear();
        sparseIntArray.clear();
        int bytesLeft = parsableByteArray.bytesLeft();
        while (bytesLeft > 0) {
            parsableByteArray.readBytes(i3, 5, vorbisBitArray2.data);
            vorbisBitArray2.setPosition(i3);
            int readBits = vorbisBitArray2.readBits(8);
            vorbisBitArray2.skipBits(i4);
            int readBits2 = vorbisBitArray2.readBits(i5);
            vorbisBitArray2.skipBits(4);
            int readBits3 = vorbisBitArray2.readBits(12);
            int i6 = parsableByteArray.position;
            int i7 = i6 + readBits3;
            String str = null;
            ArrayList arrayList = null;
            int i8 = -1;
            int i9 = 0;
            while (true) {
                vorbisBitArray = vorbisBitArray2;
                if (parsableByteArray.position < i7) {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    int readUnsignedByte2 = parsableByteArray.position + parsableByteArray.readUnsignedByte();
                    if (readUnsignedByte2 <= i7) {
                        int i10 = bytesLeft;
                        if (readUnsignedByte == 5) {
                            long readUnsignedInt = parsableByteArray.readUnsignedInt();
                            if (readUnsignedInt == 1094921523) {
                                i8 = 129;
                            } else if (readUnsignedInt == 1161904947) {
                                i8 = 135;
                            } else {
                                if (readUnsignedInt != 1094921524) {
                                    if (readUnsignedInt == 1212503619) {
                                        i8 = 36;
                                    }
                                }
                                i8 = EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE;
                            }
                            i2 = readUnsignedByte2;
                            sparseArray2 = sparseArray4;
                            parsableByteArray.skipBytes(i2 - parsableByteArray.position);
                            vorbisBitArray2 = vorbisBitArray;
                            bytesLeft = i10;
                            sparseArray4 = sparseArray2;
                        } else {
                            if (readUnsignedByte == 106) {
                                i2 = readUnsignedByte2;
                                sparseArray2 = sparseArray4;
                                i8 = 129;
                            } else if (readUnsignedByte == 122) {
                                sparseArray2 = sparseArray4;
                                i8 = 135;
                                i2 = readUnsignedByte2;
                            } else if (readUnsignedByte == 127) {
                                int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                                if (readUnsignedByte3 != 21) {
                                    if (readUnsignedByte3 == 14) {
                                        i8 = 136;
                                    } else if (readUnsignedByte3 == 33) {
                                        i8 = EnumC0170g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE;
                                    }
                                    i2 = readUnsignedByte2;
                                    sparseArray2 = sparseArray4;
                                }
                                i8 = EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE;
                                i2 = readUnsignedByte2;
                                sparseArray2 = sparseArray4;
                            } else if (readUnsignedByte == 123) {
                                i2 = readUnsignedByte2;
                                sparseArray2 = sparseArray4;
                                i8 = EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE;
                            } else if (readUnsignedByte == 10) {
                                str = parsableByteArray.readString(3, StandardCharsets.UTF_8).trim();
                                i2 = readUnsignedByte2;
                                sparseArray2 = sparseArray4;
                                i9 = parsableByteArray.readUnsignedByte();
                            } else {
                                int i11 = 3;
                                if (readUnsignedByte == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (parsableByteArray.position < readUnsignedByte2) {
                                        String trim = parsableByteArray.readString(i11, StandardCharsets.UTF_8).trim();
                                        parsableByteArray.readUnsignedByte();
                                        int i12 = readUnsignedByte2;
                                        byte[] bArr = new byte[4];
                                        parsableByteArray.readBytes(0, 4, bArr);
                                        arrayList2.add(new TsPayloadReader.DvbSubtitleInfo(trim, bArr));
                                        readUnsignedByte2 = i12;
                                        sparseArray4 = sparseArray4;
                                        i11 = 3;
                                    }
                                    i2 = readUnsignedByte2;
                                    sparseArray2 = sparseArray4;
                                    arrayList = arrayList2;
                                    i8 = 89;
                                } else {
                                    i2 = readUnsignedByte2;
                                    sparseArray2 = sparseArray4;
                                    if (readUnsignedByte == 111) {
                                        i8 = EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                                    }
                                }
                            }
                            parsableByteArray.skipBytes(i2 - parsableByteArray.position);
                            vorbisBitArray2 = vorbisBitArray;
                            bytesLeft = i10;
                            sparseArray4 = sparseArray2;
                        }
                    }
                }
            }
            SparseArray sparseArray5 = sparseArray4;
            int i13 = bytesLeft;
            parsableByteArray.setPosition(i7);
            HuffmanTreeGroup huffmanTreeGroup = new HuffmanTreeGroup(i8, str, i9, arrayList, Arrays.copyOfRange(parsableByteArray.data, i6, i7));
            String str2 = str;
            if (readBits == 6 || readBits == 5) {
                readBits = i8;
            }
            bytesLeft = i13 - (readBits3 + 5);
            if (sparseBooleanArray.get(readBits2)) {
                i = 3;
            } else {
                DefaultTsPayloadReaderFactory defaultTsPayloadReaderFactory = tsExtractor.payloadReaderFactory;
                i = 3;
                if (readBits != 2) {
                    if (readBits == 3 || readBits == 4) {
                        pesReader2 = new PesReader(new MpegAudioReader(str2, huffmanTreeGroup.getRoleFlags(), "video/mp2t"));
                    } else {
                        if (readBits == 21) {
                            pesReader = new PesReader(new Id3Reader());
                        } else if (readBits == 27) {
                            pesReader = new PesReader(new H264Reader(new SeiReader(defaultTsPayloadReaderFactory.getClosedCaptionFormats(huffmanTreeGroup), 0), false, false));
                        } else if (readBits == 36) {
                            pesReader = new PesReader(new H265Reader(new SeiReader(defaultTsPayloadReaderFactory.getClosedCaptionFormats(huffmanTreeGroup), 0)));
                        } else if (readBits == 45) {
                            pesReader = new PesReader(new MpeghReader());
                        } else if (readBits == 89) {
                            pesReader = new PesReader(new Id3Reader((List) huffmanTreeGroup.codes));
                        } else if (readBits == 172) {
                            pesReader2 = new PesReader(new Ac3Reader(str2, huffmanTreeGroup.getRoleFlags(), "video/mp2t", 1));
                        } else if (readBits != 257) {
                            if (readBits != 138) {
                                if (readBits != 139) {
                                    switch (readBits) {
                                        case 15:
                                            pesReader2 = new PesReader(new AdtsReader(str2, "video/mp2t", huffmanTreeGroup.getRoleFlags(), false));
                                            break;
                                        case 16:
                                            pesReader = new PesReader(new H263Reader(new SeiReader(defaultTsPayloadReaderFactory.getClosedCaptionFormats(huffmanTreeGroup), 1)));
                                            break;
                                        case 17:
                                            pesReader2 = new PesReader(new LatmReader(str2, huffmanTreeGroup.getRoleFlags()));
                                            break;
                                        default:
                                            switch (readBits) {
                                                case 128:
                                                    break;
                                                case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                                                    pesReader2 = new PesReader(new Ac3Reader(str2, huffmanTreeGroup.getRoleFlags(), "video/mp2t", 0));
                                                    break;
                                                case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                                                    pesReader = null;
                                                    break;
                                                default:
                                                    switch (readBits) {
                                                        case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                                                            pesReader = new SectionReader(new SVG("application/x-scte35"));
                                                            break;
                                                    }
                                            }
                                    }
                                } else {
                                    pesReader2 = new PesReader(new DtsReader(str2, huffmanTreeGroup.getRoleFlags(), 5408));
                                }
                            }
                            pesReader2 = new PesReader(new DtsReader(str2, huffmanTreeGroup.getRoleFlags(), 4096));
                        } else {
                            pesReader = new SectionReader(new SVG("application/vnd.dvb.ait"));
                        }
                        sparseIntArray.put(readBits2, readBits2);
                        sparseArray3.put(readBits2, pesReader);
                    }
                    pesReader = pesReader2;
                    sparseIntArray.put(readBits2, readBits2);
                    sparseArray3.put(readBits2, pesReader);
                }
                pesReader = new PesReader(new H262Reader(new SeiReader(defaultTsPayloadReaderFactory.getClosedCaptionFormats(huffmanTreeGroup), 1), "video/mp2t"));
                sparseIntArray.put(readBits2, readBits2);
                sparseArray3.put(readBits2, pesReader);
            }
            i4 = i;
            vorbisBitArray2 = vorbisBitArray;
            sparseArray4 = sparseArray5;
            i3 = 0;
            i5 = 13;
        }
        SparseArray sparseArray6 = sparseArray4;
        int size = sparseIntArray.size();
        int i14 = 0;
        while (i14 < size) {
            int keyAt = sparseIntArray.keyAt(i14);
            int valueAt = sparseIntArray.valueAt(i14);
            sparseBooleanArray.put(keyAt, true);
            tsExtractor.trackPids.put(valueAt, true);
            TsPayloadReader tsPayloadReader = (TsPayloadReader) sparseArray3.valueAt(i14);
            if (tsPayloadReader != null) {
                tsPayloadReader.init(timestampAdjuster, tsExtractor.output, new zzcjk(readUnsignedShort, keyAt, PKIFailureInfo.certRevoked));
                sparseArray = sparseArray6;
                sparseArray.put(valueAt, tsPayloadReader);
            } else {
                sparseArray = sparseArray6;
            }
            i14++;
            sparseArray6 = sparseArray;
        }
        sparseArray6.remove(this.state);
        tsExtractor.remainingPmts = 0;
        tsExtractor.output.endTracks();
        tsExtractor.tracksEnded = true;
    }

    public void detachViewFromParent(int i) {
        int offset = getOffset(i);
        ((HeadersReader) this.projectPackages).remove(offset);
        RecyclerView recyclerView = RecyclerView.this;
        View childAt = recyclerView.getChildAt(offset);
        if (childAt != null) {
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(childViewHolderInt);
                    Path$$ExternalSyntheticBUOutline0.m(sb, (Object) recyclerView.exceptionLabel());
                    return;
                } else {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        android.util.Log.d("RecyclerView", "tmpDetach " + childViewHolderInt);
                    }
                    childViewHolderInt.addFlags(256);
                }
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            Mod$$ExternalSyntheticBUOutline0.m("No view at offset ", offset, recyclerView.exceptionLabel());
            return;
        }
        recyclerView.detachViewFromParent(offset);
    }

    public NavDestination findNode$navigation_common_release(String str, boolean z) {
        Object obj;
        NavGraph navGraph;
        str.getClass();
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) this.projectPackages;
        sparseArrayCompat.getClass();
        Iterator it = SequencesKt__SequencesKt.asSequence(new UIntArray.Iterator(sparseArrayCompat, 1)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            NavDestination navDestination = (NavDestination) obj;
            if (StringsKt__StringsJVMKt.equals(navDestination.impl.route, str, false) || navDestination.impl.matchRoute$navigation_common_release(str) != null) {
                break;
            }
        }
        NavDestination navDestination2 = (NavDestination) obj;
        if (navDestination2 != null) {
            return navDestination2;
        }
        if (!z || (navGraph = ((NavGraph) this.logger).parent) == null) {
            return null;
        }
        TraceParser traceParser = navGraph.impl;
        traceParser.getClass();
        if (StringsKt.isBlank(str)) {
            return null;
        }
        return traceParser.findNode$navigation_common_release(str, true);
    }

    public NavDestination findNodeComprehensive$navigation_common_release(int i, NavDestination navDestination, NavDestination navDestination2, boolean z) {
        NavGraph navGraph = (NavGraph) this.logger;
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) this.projectPackages;
        sparseArrayCompat.getClass();
        NavDestination navDestination3 = (NavDestination) SieveCacheKt.commonGet(sparseArrayCompat, i);
        if (navDestination2 != null) {
            if (Intrinsics.areEqual(navDestination3, navDestination2) && Intrinsics.areEqual(navDestination3.parent, navDestination2.parent)) {
                return navDestination3;
            }
            navDestination3 = null;
        } else if (navDestination3 != null) {
            return navDestination3;
        }
        if (z) {
            Iterator it = SequencesKt__SequencesKt.asSequence(new UIntArray.Iterator(sparseArrayCompat, 1)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    navDestination3 = null;
                    break;
                }
                NavDestination navDestination4 = (NavDestination) it.next();
                navDestination3 = (!(navDestination4 instanceof NavGraph) || navDestination4.equals(navDestination)) ? null : ((NavGraph) navDestination4).impl.findNodeComprehensive$navigation_common_release(i, navGraph, navDestination2, true);
                if (navDestination3 != null) {
                    break;
                }
            }
        }
        if (navDestination3 != null) {
            return navDestination3;
        }
        NavGraph navGraph2 = navGraph.parent;
        if (navGraph2 == null || navGraph2.equals(navDestination)) {
            return null;
        }
        NavGraph navGraph3 = navGraph.parent;
        navGraph3.getClass();
        return navGraph3.impl.findNodeComprehensive$navigation_common_release(i, navGraph, navDestination2, z);
    }

    @Override // androidx.core.util.Supplier
    public Object get() {
        ((AudioSpec) this.projectPackages).getClass();
        StringUtilsKt.d("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        AutoValue_EncoderProfilesProxy_AudioProfileProxy autoValue_EncoderProfilesProxy_AudioProfileProxy = (AutoValue_EncoderProfilesProxy_AudioProfileProxy) this.threadAttrs;
        int i = autoValue_EncoderProfilesProxy_AudioProfileProxy.bitrate;
        AutoValue_AudioSettings autoValue_AudioSettings = (AutoValue_AudioSettings) this.currentThread;
        int i2 = autoValue_AudioSettings.channelCount;
        int i3 = autoValue_EncoderProfilesProxy_AudioProfileProxy.channels;
        int i4 = autoValue_AudioSettings.encodeSampleRate;
        int scaleBitrate = AudioConfigUtil.scaleBitrate(i, i2, i3, i4, autoValue_EncoderProfilesProxy_AudioProfileProxy.sampleRate);
        SubtreeManager subtreeManager = new SubtreeManager();
        subtreeManager.contextForChildren = -1;
        String str = (String) this.logger;
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null mimeType");
            return null;
        }
        subtreeManager.snapshotCache = str;
        subtreeManager.contextForChildren = Integer.valueOf(this.state);
        subtreeManager.emitActionToParent = Timebase.UPTIME;
        subtreeManager.children = Integer.valueOf(i2);
        subtreeManager.interceptor = Integer.valueOf(autoValue_AudioSettings.captureSampleRate);
        subtreeManager.idCounter = Integer.valueOf(i4);
        subtreeManager.workflowSession = Integer.valueOf(scaleBitrate);
        return subtreeManager.m4004build();
    }

    public int getAttributeArrayLocationAndEnable(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.state, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        Log.checkGlError();
        return glGetAttribLocation;
    }

    public View getChildAt(int i) {
        return RecyclerView.this.getChildAt(getOffset(i));
    }

    public int getChildCount() {
        return RecyclerView.this.getChildCount() - ((ArrayList) this.currentThread).size();
    }

    public int getCurrentThreadState() {
        HashMap hashMap = (HashMap) this.threadAttrs;
        String str = (String) hashMap.get("state");
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 82) {
                if (hashCode != 83) {
                    if (hashCode == 90 && str.equals("Z")) {
                        return 4;
                    }
                } else if (str.equals("S")) {
                    return 6;
                }
            } else if (str.equals("R")) {
                return 3;
            }
        }
        if (hashMap.containsKey("Runnable") || hashMap.containsKey("Native")) {
            return 3;
        }
        return (hashMap.containsKey("Waiting") || hashMap.containsKey("WaitingForTaskProcessor") || hashMap.containsKey("Sleeping")) ? 6 : 7;
    }

    public int getOffset(int i) {
        HeadersReader headersReader = (HeadersReader) this.projectPackages;
        if (i < 0) {
            return -1;
        }
        int childCount = RecyclerView.this.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int countOnesBefore = i - (i2 - headersReader.countOnesBefore(i2));
            if (countOnesBefore == 0) {
                while (headersReader.get(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += countOnesBefore;
        }
        return -1;
    }

    public View getUnfilteredChildAt(int i) {
        return RecyclerView.this.getChildAt(i);
    }

    public int getUnfilteredChildCount() {
        return RecyclerView.this.getChildCount();
    }

    public void hideViewInternal(View view) {
        ((ArrayList) this.currentThread).add(view);
        RecyclerView.AnonymousClass7 anonymousClass7 = (RecyclerView.AnonymousClass7) this.logger;
        RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
        }
    }

    @Override // androidx.media3.extractor.ts.SectionPayloadReader
    public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, zzcjk zzcjkVar) {
    }

    public NavDestination.DeepLinkMatch matchDeepLinkComprehensive$navigation_common_release(NavDestination.DeepLinkMatch deepLinkMatch, SVG svg, boolean z, NavDestination navDestination) {
        NavDestination.DeepLinkMatch deepLinkMatch2;
        NavGraph navGraph = (NavGraph) this.logger;
        ArrayList arrayList = new ArrayList();
        Iterator it = navGraph.iterator();
        while (true) {
            NavGraphImpl$iterator$1 navGraphImpl$iterator$1 = (NavGraphImpl$iterator$1) it;
            if (!navGraphImpl$iterator$1.hasNext()) {
                break;
            }
            NavDestination navDestination2 = (NavDestination) navGraphImpl$iterator$1.next();
            deepLinkMatch2 = Intrinsics.areEqual(navDestination2, navDestination) ? null : navDestination2.matchDeepLink(svg);
            if (deepLinkMatch2 != null) {
                arrayList.add(deepLinkMatch2);
            }
        }
        NavDestination.DeepLinkMatch deepLinkMatch3 = (NavDestination.DeepLinkMatch) CollectionsKt.maxOrNull((Iterable) arrayList);
        NavGraph navGraph2 = navGraph.parent;
        if (navGraph2 != null && z && !navGraph2.equals(navDestination)) {
            deepLinkMatch2 = navGraph2.matchDeepLinkComprehensive(svg, navGraph);
        }
        return (NavDestination.DeepLinkMatch) CollectionsKt.maxOrNull((Iterable) ArraysKt___ArraysKt.filterNotNull(new NavDestination.DeepLinkMatch[]{deepLinkMatch, deepLinkMatch3, deepLinkMatch2}));
    }

    public void parse(InputStream inputStream, TraceEventEnhancer$invoke$1$1 traceEventEnhancer$invoke$1$1) {
        AppUpdateData.forEachLine(new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), PKIFailureInfo.certRevoked), new TraceParser$parse$1(0, this, traceEventEnhancer$invoke$1$1));
    }

    public Stackframe parseStackframe$bugsnag_plugin_android_exitinfo_release(String str) {
        int indexOf$default;
        int i;
        int indexOf$default2;
        int indexOf$default3;
        int indexOf$default4;
        int lastIndexOf$default;
        int lastIndexOf$default2;
        int lastIndexOf$default3;
        char first = StringsKt___StringsKt.first(str);
        boolean z = false;
        if (first == 'a') {
            if (StringsKt__StringsJVMKt.startsWith(str, "at ", false)) {
                int lastIndexOf$default4 = StringsKt.lastIndexOf$default('(', 0, 6, (CharSequence) str);
                int lastIndexOf$default5 = StringsKt.lastIndexOf$default(')', 0, 6, (CharSequence) str);
                if (lastIndexOf$default4 != -1 && lastIndexOf$default5 != -1 && lastIndexOf$default5 > lastIndexOf$default4) {
                    String substring = str.substring(3, lastIndexOf$default4);
                    String substring2 = str.substring(lastIndexOf$default4 + 1, lastIndexOf$default5);
                    String substringBefore$default = StringsKt.substringBefore$default(substring2, ':');
                    Integer intOrNull = StringsKt.toIntOrNull(StringsKt.substringAfter(':', substring2, ""));
                    Collection collection = (Collection) this.projectPackages;
                    if (!(collection instanceof Collection) || !collection.isEmpty()) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (StringsKt__StringsJVMKt.startsWith(StringsKt.substringBeforeLast$default(substring, '.'), (String) it.next(), false)) {
                                z = true;
                                break;
                            }
                        }
                    }
                    Stackframe stackframe = new Stackframe(substring, substringBefore$default, intOrNull, z ? Boolean.valueOf(z) : null, null);
                    stackframe.f943type = ErrorType.ANDROID;
                    return stackframe;
                }
            }
        } else if ((first == '#' || first == 'n') && (indexOf$default = StringsKt.indexOf$default((CharSequence) str, "pc ", 0, false, 6)) != -1 && (indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, ' ', (i = indexOf$default + 3), false, 4)) != -1 && (indexOf$default3 = StringsKt.indexOf$default((CharSequence) str, '/', indexOf$default2 + 1, false, 4)) != -1 && (indexOf$default4 = StringsKt.indexOf$default((CharSequence) str, '(', indexOf$default3 + 1, false, 4)) != -1 && (lastIndexOf$default = StringsKt.lastIndexOf$default(')', 0, 6, (CharSequence) str)) != -1 && (lastIndexOf$default2 = StringsKt.lastIndexOf$default('(', lastIndexOf$default - 1, 4, (CharSequence) str)) != -1 && lastIndexOf$default >= lastIndexOf$default2 && (lastIndexOf$default3 = StringsKt.lastIndexOf$default(')', lastIndexOf$default2 - 1, 4, (CharSequence) str)) != -1 && lastIndexOf$default3 >= indexOf$default4) {
            int lastIndexOf$default6 = StringsKt.lastIndexOf$default('+', lastIndexOf$default3 - 1, 4, (CharSequence) str);
            String removePrefix = StringsKt.removePrefix("BuildId: ", str.substring(lastIndexOf$default2 + 1, lastIndexOf$default));
            Stackframe stackframe2 = new Stackframe((indexOf$default4 > lastIndexOf$default6 || lastIndexOf$default6 > lastIndexOf$default3) ? str.substring(indexOf$default4 + 1, lastIndexOf$default3) : str.substring(indexOf$default4 + 1, lastIndexOf$default6), StringsKt.trim(str.substring(indexOf$default3, indexOf$default4 - 1)).toString(), StringsKt.toLongOrNull(16, str.substring(i, indexOf$default2)), null, null);
            stackframe2.f943type = ErrorType.C;
            stackframe2.codeIdentifier = removePrefix;
            return stackframe2;
        }
        return null;
    }

    public void parseThreadAttributes(String str) {
        HashMap hashMap = (HashMap) this.threadAttrs;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            char charAt = str.charAt(i);
            if (charAt != '|' && !CharsKt.isWhitespace(charAt)) {
                break;
            } else {
                i++;
            }
        }
        while (i >= 0 && i < str.length() - 1) {
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '=', i, false, 4);
            int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, ' ', i, false, 4);
            if (indexOf$default2 != -1 && indexOf$default2 < indexOf$default) {
                hashMap.put(str.substring(i, indexOf$default2), "");
            } else if (indexOf$default != -1) {
                String substring = str.substring(i, indexOf$default);
                if (indexOf$default < str.length() - 1) {
                    int i2 = indexOf$default + 1;
                    char charAt2 = str.charAt(i2);
                    if (charAt2 == '\"') {
                        int i3 = indexOf$default + 2;
                        int length2 = str.length();
                        int indexOf$default3 = StringsKt.indexOf$default((CharSequence) str, '\"', i3, false, 4);
                        if (indexOf$default3 != -1) {
                            length2 = indexOf$default3;
                        }
                        hashMap.put(substring, str.substring(i3, length2));
                        i = length2 + 1;
                    } else if (charAt2 == '(') {
                        int length3 = str.length() - 1;
                        int indexOf$default4 = StringsKt.indexOf$default((CharSequence) str, ')', indexOf$default + 2, false, 4);
                        if (indexOf$default4 != -1) {
                            length3 = indexOf$default4;
                        }
                        hashMap.put(substring, str.substring(i2, length3 + 1));
                        i = length3 + 2;
                    } else {
                        if (indexOf$default2 == -1) {
                            indexOf$default2 = str.length();
                        }
                        hashMap.put(substring, str.substring(i2, indexOf$default2));
                    }
                } else {
                    hashMap.put(str.substring(i, indexOf$default), "");
                    i = indexOf$default + 1;
                }
            } else if (i < str.length() - 1) {
                hashMap.put(str.substring(i), "");
                i = str.length();
            }
            i = indexOf$default2 + 1;
        }
    }

    public void setAuthToken(AutoValue_TokenResult autoValue_TokenResult) {
        this.threadAttrs = autoValue_TokenResult;
    }

    public void setFid(String str) {
        this.projectPackages = str;
    }

    public void setRefreshToken(String str) {
        this.currentThread = str;
    }

    public void setResponseCode(int i) {
        this.state = i;
    }

    public void setStartDestinationRoute$navigation_common_release(String str) {
        int hashCode;
        NavGraph navGraph = (NavGraph) this.logger;
        if (str == null) {
            hashCode = 0;
        } else if (str.equals(((NavDestination) navGraph).impl.route)) {
            Path$$ExternalSyntheticBUOutline0.m$1("Start destination ", str, " cannot use the same route as the graph ", navGraph);
            return;
        } else if (StringsKt.isBlank(str)) {
            a$$ExternalSyntheticBUOutline0.m$3("Cannot have an empty start destination route");
            return;
        } else {
            int i = NavDestination.$r8$clinit;
            hashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        }
        this.state = hashCode;
        this.threadAttrs = str;
    }

    public void setUri(String str) {
        this.logger = str;
    }

    public Unit shutdown$camera_camera2_pipe() {
        android.util.Log.d("CXCP", "Closing " + this);
        if (!((AtomicBoolean) this.projectPackages).compareAndSet()) {
            return Unit.INSTANCE;
        }
        ((Camera2CaptureSequenceProcessor) this.logger).disconnect$camera_camera2_pipe();
        Unit unit = Unit.INSTANCE;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return unit;
    }

    public void stopRepeating$camera_camera2_pipe() {
        Camera2CaptureSequenceProcessor camera2CaptureSequenceProcessor = (Camera2CaptureSequenceProcessor) this.logger;
        synchronized (camera2CaptureSequenceProcessor.lock) {
            android.util.Log.d("CXCP", camera2CaptureSequenceProcessor + "#stopRepeating");
            camera2CaptureSequenceProcessor.session.stopRepeating();
        }
    }

    public boolean submit$camera_camera2_pipe(boolean z, List list, Map map, Map map2, Map map3, List list2) {
        Throwable th;
        boolean z2;
        boolean isTerminated;
        list.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        list2.getClass();
        if (((AtomicBoolean) this.projectPackages).getValue()) {
            android.util.Log.w("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
            return false;
        }
        try {
            Trace.beginSection("CXCP#buildCaptureSequence");
            Camera2CaptureSequence build$1 = ((Camera2CaptureSequenceProcessor) this.logger).build$1(z, list, map, map2, map3, (Toolbar.AnonymousClass1) this.threadAttrs, list2);
            Trace.endSection();
            boolean z3 = true;
            if (build$1 == null) {
                List list3 = list;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        if (((androidx.camera.camera2.pipe.Request) it.next()).inputRequest != null) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                androidx.camera.camera2.pipe.Request request = (androidx.camera.camera2.pipe.Request) it2.next();
                                InputRequest inputRequest = request.inputRequest;
                                if (inputRequest != null) {
                                    ImageWrapper imageWrapper = inputRequest.image;
                                    if (imageWrapper instanceof AutoCloseable) {
                                        imageWrapper.close();
                                    } else {
                                        if (!(imageWrapper instanceof ExecutorService)) {
                                            Path$$ExternalSyntheticBUOutline0.m$3();
                                            return false;
                                        }
                                        ExecutorService executorService = (ExecutorService) imageWrapper;
                                        if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                                            executorService.shutdown();
                                            boolean z4 = false;
                                            while (!isTerminated) {
                                                try {
                                                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                                } catch (InterruptedException unused) {
                                                    if (!z4) {
                                                        executorService.shutdownNow();
                                                        z4 = true;
                                                    }
                                                }
                                            }
                                            if (z4) {
                                                java.lang.Thread.currentThread().interrupt();
                                            }
                                        }
                                    }
                                }
                                Iterator it3 = request.listeners.iterator();
                                while (it3.hasNext()) {
                                    ((Request.Listener) it3.next()).onAborted(request);
                                }
                            }
                            return true;
                        }
                    }
                }
                android.util.Log.w("CXCP", "Failed to submit " + list + ": " + this + " failed to build CaptureSequence.");
                return false;
            }
            if (((AtomicBoolean) this.projectPackages).getValue()) {
                android.util.Log.w("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
                return false;
            }
            if (!build$1.repeating) {
                synchronized (((ArrayList) this.currentThread)) {
                    ((ArrayList) this.currentThread).add(build$1);
                }
            }
            try {
                android.util.Log.d("CXCP", this + " submitting " + build$1);
                Trace.beginSection("InvokeInternalListeners");
                int size = build$1.captureMetadataList.size();
                for (int i = 0; i < size; i++) {
                    RequestMetadata requestMetadata = (RequestMetadata) build$1.captureMetadataList.get(i);
                    int size2 = build$1.listeners.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((Request.Listener) build$1.listeners.get(i2)).onRequestSequenceCreated(requestMetadata);
                    }
                }
                Trace.endSection();
                Trace.beginSection("InvokeRequestListeners");
                int size3 = build$1.captureMetadataList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    RequestMetadata requestMetadata2 = (RequestMetadata) build$1.captureMetadataList.get(i3);
                    int size4 = requestMetadata2.getRequest().listeners.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        ((Request.Listener) requestMetadata2.getRequest().listeners.get(i4)).onRequestSequenceCreated(requestMetadata2);
                    }
                }
            } catch (CameraAccessException unused2) {
                if (!build$1.repeating) {
                    synchronized (((ArrayList) this.currentThread)) {
                        ((ArrayList) this.currentThread).remove(build$1);
                        Trace.beginSection("InvokeInternalListeners");
                        int size5 = build$1.captureMetadataList.size();
                        for (int i5 = 0; i5 < size5; i5++) {
                            RequestMetadata requestMetadata3 = (RequestMetadata) build$1.captureMetadataList.get(i5);
                            int size6 = build$1.listeners.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                ((Request.Listener) build$1.listeners.get(i6)).onAborted(requestMetadata3.getRequest());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size7 = build$1.captureMetadataList.size();
                        for (int i7 = 0; i7 < size7; i7++) {
                            RequestMetadata requestMetadata4 = (RequestMetadata) build$1.captureMetadataList.get(i7);
                            int size8 = requestMetadata4.getRequest().listeners.size();
                            for (int i8 = 0; i8 < size8; i8++) {
                                ((Request.Listener) requestMetadata4.getRequest().listeners.get(i8)).onAborted(requestMetadata4.getRequest());
                            }
                        }
                    }
                }
            } catch (ObjectUnavailableException unused3) {
                if (!build$1.repeating) {
                    synchronized (((ArrayList) this.currentThread)) {
                        ((ArrayList) this.currentThread).remove(build$1);
                        Trace.beginSection("InvokeInternalListeners");
                        int size9 = build$1.captureMetadataList.size();
                        for (int i9 = 0; i9 < size9; i9++) {
                            RequestMetadata requestMetadata5 = (RequestMetadata) build$1.captureMetadataList.get(i9);
                            int size10 = build$1.listeners.size();
                            for (int i10 = 0; i10 < size10; i10++) {
                                ((Request.Listener) build$1.listeners.get(i10)).onAborted(requestMetadata5.getRequest());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size11 = build$1.captureMetadataList.size();
                        for (int i11 = 0; i11 < size11; i11++) {
                            RequestMetadata requestMetadata6 = (RequestMetadata) build$1.captureMetadataList.get(i11);
                            int size12 = requestMetadata6.getRequest().listeners.size();
                            for (int i12 = 0; i12 < size12; i12++) {
                                ((Request.Listener) requestMetadata6.getRequest().listeners.get(i12)).onAborted(requestMetadata6.getRequest());
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                z3 = false;
            }
            synchronized (build$1) {
                if (!((AtomicBoolean) this.projectPackages).getValue()) {
                    try {
                        Trace.beginSection("CXCP#submit(CaptureSequence)");
                        Integer submit$1 = ((Camera2CaptureSequenceProcessor) this.logger).submit$1(build$1);
                        int intValue = submit$1 != null ? submit$1.intValue() : -1;
                        build$1._sequenceNumber = Integer.valueOf(intValue);
                        if (intValue != -1) {
                            Trace.beginSection("InvokeInternalListeners");
                            int size13 = build$1.captureMetadataList.size();
                            for (int i13 = 0; i13 < size13; i13++) {
                                RequestMetadata requestMetadata7 = (RequestMetadata) build$1.captureMetadataList.get(i13);
                                int size14 = build$1.listeners.size();
                                for (int i14 = 0; i14 < size14; i14++) {
                                    ((Request.Listener) build$1.listeners.get(i14)).onRequestSequenceSubmitted(requestMetadata7);
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size15 = build$1.captureMetadataList.size();
                            for (int i15 = 0; i15 < size15; i15++) {
                                RequestMetadata requestMetadata8 = (RequestMetadata) build$1.captureMetadataList.get(i15);
                                int size16 = requestMetadata8.getRequest().listeners.size();
                                for (int i16 = 0; i16 < size16; i16++) {
                                    ((Request.Listener) requestMetadata8.getRequest().listeners.get(i16)).onRequestSequenceSubmitted(requestMetadata8);
                                }
                            }
                            try {
                                android.util.Log.d("CXCP", this + " submitted " + build$1);
                                z2 = true;
                            } catch (CameraAccessException | ObjectUnavailableException unused4) {
                            } catch (Throwable th3) {
                                th = th3;
                                if (z3) {
                                    throw th;
                                }
                                if (build$1.repeating) {
                                    throw th;
                                }
                                synchronized (((ArrayList) this.currentThread)) {
                                    ((ArrayList) this.currentThread).remove(build$1);
                                }
                                Trace.beginSection("InvokeInternalListeners");
                                int size17 = build$1.captureMetadataList.size();
                                for (int i17 = 0; i17 < size17; i17++) {
                                    RequestMetadata requestMetadata9 = (RequestMetadata) build$1.captureMetadataList.get(i17);
                                    int size18 = build$1.listeners.size();
                                    for (int i18 = 0; i18 < size18; i18++) {
                                        ((Request.Listener) build$1.listeners.get(i18)).onAborted(requestMetadata9.getRequest());
                                    }
                                }
                                Trace.endSection();
                                Trace.beginSection("InvokeRequestListeners");
                                int size19 = build$1.captureMetadataList.size();
                                for (int i19 = 0; i19 < size19; i19++) {
                                    RequestMetadata requestMetadata10 = (RequestMetadata) build$1.captureMetadataList.get(i19);
                                    int size20 = requestMetadata10.getRequest().listeners.size();
                                    for (int i20 = 0; i20 < size20; i20++) {
                                        ((Request.Listener) requestMetadata10.getRequest().listeners.get(i20)).onAborted(requestMetadata10.getRequest());
                                    }
                                }
                                throw th;
                            }
                        } else {
                            android.util.Log.w("CXCP", "Failed to submit " + build$1 + ": " + this + " received -1 from submit.");
                            z2 = false;
                            z3 = false;
                        }
                        if (z2 || build$1.repeating) {
                            return z3;
                        }
                        synchronized (((ArrayList) this.currentThread)) {
                            ((ArrayList) this.currentThread).remove(build$1);
                        }
                        Trace.beginSection("InvokeInternalListeners");
                        int size21 = build$1.captureMetadataList.size();
                        for (int i21 = 0; i21 < size21; i21++) {
                            RequestMetadata requestMetadata11 = (RequestMetadata) build$1.captureMetadataList.get(i21);
                            int size22 = build$1.listeners.size();
                            for (int i22 = 0; i22 < size22; i22++) {
                                ((Request.Listener) build$1.listeners.get(i22)).onAborted(requestMetadata11.getRequest());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size23 = build$1.captureMetadataList.size();
                        for (int i23 = 0; i23 < size23; i23++) {
                            RequestMetadata requestMetadata12 = (RequestMetadata) build$1.captureMetadataList.get(i23);
                            int size24 = requestMetadata12.getRequest().listeners.size();
                            for (int i24 = 0; i24 < size24; i24++) {
                                ((Request.Listener) requestMetadata12.getRequest().listeners.get(i24)).onAborted(requestMetadata12.getRequest());
                            }
                        }
                        return z3;
                    } finally {
                    }
                }
                android.util.Log.w("CXCP", "Failed to submit " + build$1 + ": " + this + " is closed.");
                if (!build$1.repeating) {
                    synchronized (((ArrayList) this.currentThread)) {
                        ((ArrayList) this.currentThread).remove(build$1);
                    }
                    Trace.beginSection("InvokeInternalListeners");
                    int size25 = build$1.captureMetadataList.size();
                    for (int i25 = 0; i25 < size25; i25++) {
                        RequestMetadata requestMetadata13 = (RequestMetadata) build$1.captureMetadataList.get(i25);
                        int size26 = build$1.listeners.size();
                        for (int i26 = 0; i26 < size26; i26++) {
                            ((Request.Listener) build$1.listeners.get(i26)).onAborted(requestMetadata13.getRequest());
                        }
                    }
                    Trace.endSection();
                    Trace.beginSection("InvokeRequestListeners");
                    int size27 = build$1.captureMetadataList.size();
                    for (int i27 = 0; i27 < size27; i27++) {
                        RequestMetadata requestMetadata14 = (RequestMetadata) build$1.captureMetadataList.get(i27);
                        int size28 = requestMetadata14.getRequest().listeners.size();
                        for (int i28 = 0; i28 < size28; i28++) {
                            ((Request.Listener) requestMetadata14.getRequest().listeners.get(i28)).onAborted(requestMetadata14.getRequest());
                        }
                    }
                    return false;
                }
                return false;
            }
        } finally {
            Trace.endSection();
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 1:
                return "GraphRequestProcessor-" + this.state;
            case 4:
                return "pos =" + Arrays.toString((double[]) this.projectPackages) + " period=" + Arrays.toString((float[]) this.logger);
            case 10:
                return ((HeadersReader) this.projectPackages).toString() + ", hidden list:" + ((ArrayList) this.currentThread).size();
            default:
                return super.toString();
        }
    }

    public void unhideViewInternal(View view) {
        if (((ArrayList) this.currentThread).remove(view)) {
            RecyclerView.AnonymousClass7 anonymousClass7 = (RecyclerView.AnonymousClass7) this.logger;
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }
    }

    public void walk(int i) {
        int[] iArr = (int[]) this.currentThread;
        if (iArr[i] != 0) {
            return;
        }
        iArr[i] = 1;
        for (GridLayout.Arc arc : ((GridLayout.Arc[][]) this.projectPackages)[i]) {
            walk(arc.span.max);
            GridLayout.Arc[] arcArr = (GridLayout.Arc[]) this.logger;
            int i2 = this.state;
            this.state = i2 - 1;
            arcArr[i2] = arc;
        }
        iArr[i] = 2;
    }

    /* renamed from: build, reason: collision with other method in class */
    public AutoValue_InstallationResponse m1907build() {
        return new AutoValue_InstallationResponse((String) this.logger, (String) this.projectPackages, (String) this.currentThread, (AutoValue_TokenResult) this.threadAttrs, this.state);
    }

    public NavDestination findNode$navigation_common_release(int i) {
        return findNodeComprehensive$navigation_common_release(i, (NavGraph) this.logger, null, false);
    }

    public TraceParser(Logger logger, Collection collection) {
        this.$r8$classId = 0;
        this.logger = logger;
        this.projectPackages = collection;
        this.state = 1;
        this.threadAttrs = new HashMap();
    }

    public TraceParser(String str, int i, AudioSpec audioSpec, AutoValue_AudioSettings autoValue_AudioSettings, AutoValue_EncoderProfilesProxy_AudioProfileProxy autoValue_EncoderProfilesProxy_AudioProfileProxy) {
        this.$r8$classId = 3;
        str.getClass();
        audioSpec.getClass();
        autoValue_EncoderProfilesProxy_AudioProfileProxy.getClass();
        this.logger = str;
        this.state = i;
        this.projectPackages = audioSpec;
        this.currentThread = autoValue_AudioSettings;
        this.threadAttrs = autoValue_EncoderProfilesProxy_AudioProfileProxy;
    }

    public TraceParser(NavGraph navGraph) {
        this.$r8$classId = 9;
        this.logger = navGraph;
        this.projectPackages = new SparseArrayCompat((Object) null);
    }

    public TraceParser(Camera2CaptureSequenceProcessor camera2CaptureSequenceProcessor) {
        this.$r8$classId = 1;
        this.logger = camera2CaptureSequenceProcessor;
        AtomicInt atomicInt = GraphRequestProcessorKt.graphRequestProcessorIds;
        atomicInt.getClass();
        this.state = AtomicInt.FU.incrementAndGet(atomicInt);
        this.projectPackages = AtomicFU.atomic(false);
        this.currentThread = new ArrayList();
        this.threadAttrs = new Toolbar.AnonymousClass1(this);
    }

    public TraceParser(RecyclerView.AnonymousClass7 anonymousClass7) {
        this.$r8$classId = 10;
        this.state = 0;
        this.logger = anonymousClass7;
        this.projectPackages = new HeadersReader(6);
        this.currentThread = new ArrayList();
    }

    public /* synthetic */ TraceParser(int i) {
        this.$r8$classId = i;
    }

    public TraceParser(MpegAudioUtil$Header mpegAudioUtil$Header, BiometricPrompt biometricPrompt, byte[] bArr, VorbisUtil$Mode[] vorbisUtil$ModeArr, int i) {
        this.$r8$classId = 7;
        this.logger = mpegAudioUtil$Header;
        this.projectPackages = biometricPrompt;
        this.currentThread = bArr;
        this.threadAttrs = vorbisUtil$ModeArr;
        this.state = i;
    }

    public TraceParser() {
        this.$r8$classId = 2;
        this.logger = new HashSet();
        this.projectPackages = MutableOptionsBundle.create();
        this.state = -1;
        this.currentThread = new ArrayList();
        this.threadAttrs = MutableTagBundle.create();
    }

    public TraceParser(TsExtractor tsExtractor, int i) {
        this.$r8$classId = 8;
        this.threadAttrs = tsExtractor;
        this.logger = new VorbisBitArray(new byte[5], 5);
        this.projectPackages = new SparseArray();
        this.currentThread = new SparseIntArray();
        this.state = i;
    }

    public TraceParser(GridLayout.Axis axis, GridLayout.Arc[] arcArr) {
        this.$r8$classId = 5;
        this.threadAttrs = axis;
        int length = arcArr.length;
        this.logger = new GridLayout.Arc[length];
        this.state = length - 1;
        int count = axis.getCount() + 1;
        GridLayout.Arc[][] arcArr2 = new GridLayout.Arc[count][];
        int[] iArr = new int[count];
        for (GridLayout.Arc arc : arcArr) {
            int i = arc.span.min;
            iArr[i] = iArr[i] + 1;
        }
        for (int i2 = 0; i2 < count; i2++) {
            arcArr2[i2] = new GridLayout.Arc[iArr[i2]];
        }
        Arrays.fill(iArr, 0);
        for (GridLayout.Arc arc2 : arcArr) {
            int i3 = arc2.span.min;
            GridLayout.Arc[] arcArr3 = arcArr2[i3];
            int i4 = iArr[i3];
            iArr[i3] = i4 + 1;
            arcArr3[i4] = arc2;
        }
        this.projectPackages = arcArr2;
        this.currentThread = new int[((GridLayout.Axis) this.threadAttrs).getCount() + 1];
    }
}
