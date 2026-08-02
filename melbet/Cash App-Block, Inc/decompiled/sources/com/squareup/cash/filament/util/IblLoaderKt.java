package com.squareup.cash.filament.util;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.util.coroutines.StateFlowKt$$ExternalSyntheticLambda2;
import com.squareup.util.coroutines.StateFlowKt$$ExternalSyntheticLambda4;
import com.squareup.util.coroutines.StateFlowKt$combineState$2;
import com.squareup.util.coroutines.StateFlowKt$combineState$4;
import com.stripe.android.uicore.utils.FlowToStateFlow;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.stripe.android.uicore.utils.StateFlowsKt$mapAsStateFlow$$inlined$map$1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import okio.Utf8;

/* loaded from: classes6.dex */
public abstract class IblLoaderKt {
    public static final FlowToStateFlow combineAsStateFlow(StateFlow stateFlow, StateFlow stateFlow2, StateFlow stateFlow3, Function3 function3) {
        stateFlow.getClass();
        stateFlow2.getClass();
        stateFlow3.getClass();
        int i = 4;
        return new FlowToStateFlow(new StateFlowKt$$ExternalSyntheticLambda2(function3, stateFlow, stateFlow2, stateFlow3, 1), FlowKt.combine(stateFlow, stateFlow2, stateFlow3, new StateFlowKt$combineState$4(i, 0, ArrayIteratorKt.class, function3, "suspendConversion0", "combineAsStateFlow$suspendConversion0$1(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;")));
    }

    public static final ByteBuffer loadCubemap(AssetManager assetManager, String str, int i, int i2, String str2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPremultiplied = false;
        int i3 = i * i2;
        int i4 = i3 * 4;
        int[] iArr = new int[6];
        for (int i5 = 0; i5 < 6; i5++) {
            iArr[i5] = i5 * i4;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i3 * 24);
        String[] strArr = {"px", "nx", "py", "ny", "pz", "nz"};
        for (int i6 = 0; i6 < 6; i6++) {
            try {
                InputStream open = assetManager.open(str + "/" + str2 + strArr[i6] + ".rgb32f");
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(open, null, options);
                    if (decodeStream != null) {
                        decodeStream.copyPixelsToBuffer(allocateDirect);
                    }
                    Utf8.closeFinally(open, null);
                } finally {
                }
            } catch (Exception unused) {
                return null;
            }
        }
        allocateDirect.flip();
        return allocateDirect;
    }

    public static final FlowToStateFlow mapAsStateFlow(StateFlow stateFlow, Function1 function1) {
        stateFlow.getClass();
        int i = 0;
        return new FlowToStateFlow(new StateFlowsKt$$ExternalSyntheticLambda2(i, function1, stateFlow), new StateFlowsKt$mapAsStateFlow$$inlined$map$1(stateFlow, function1, i));
    }

    public static final Pair peekSize(AssetManager assetManager, String str) {
        InputStream open = assetManager.open(str);
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(open, null, options);
            Pair pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            Utf8.closeFinally(open, null);
            return pair;
        } finally {
        }
    }

    public static final ReadonlyStateFlow stateFlowOf(Object obj) {
        return FlowKt.asStateFlow(FlowKt.MutableStateFlow(obj));
    }

    public static int zza(Object obj) {
        return (int) (Integer.rotateLeft((int) ((obj == null ? 0 : obj.hashCode()) * (-862048943)), 15) * 461845907);
    }

    public static final FlowToStateFlow combineAsStateFlow(StateFlow stateFlow, StateFlow stateFlow2, Function2 function2) {
        return new FlowToStateFlow(new StateFlowKt$$ExternalSyntheticLambda4(function2, stateFlow, stateFlow2, 1), new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(stateFlow, stateFlow2, new StateFlowKt$combineState$2(3, function2, ArrayIteratorKt.class, "suspendConversion0", "combineAsStateFlow$suspendConversion0(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 5), 0));
    }
}
