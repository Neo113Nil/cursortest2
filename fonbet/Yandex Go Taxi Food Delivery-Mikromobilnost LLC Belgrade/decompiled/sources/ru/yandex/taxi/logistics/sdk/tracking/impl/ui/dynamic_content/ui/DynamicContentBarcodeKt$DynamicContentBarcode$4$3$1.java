package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import defpackage.gw00;
import defpackage.jgz;
import defpackage.jv4;
import defpackage.ml40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o4b1;
import defpackage.o5n;
import defpackage.oz40;
import defpackage.s5g0;
import defpackage.tse;
import defpackage.vz5;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.ui.DynamicContentBarcodeKt$DynamicContentBarcode$4$3$1", f = "DynamicContentBarcode.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes7.dex */
final class DynamicContentBarcodeKt$DynamicContentBarcode$4$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $barcodeBitmap;
    final /* synthetic */ int $barcodeHeight;
    final /* synthetic */ int $barcodeWidth;
    final /* synthetic */ boolean $isHorizontalBarcode;
    final /* synthetic */ boolean $isQr;
    final /* synthetic */ o5n $model;
    final /* synthetic */ int $qrCodeSize;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicContentBarcodeKt$DynamicContentBarcode$4$3$1(oz40 oz40Var, boolean z, o5n o5nVar, int i, int i2, int i3, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.$barcodeBitmap = oz40Var;
        this.$isQr = z;
        this.$model = o5nVar;
        this.$qrCodeSize = i;
        this.$barcodeWidth = i2;
        this.$barcodeHeight = i3;
        this.$isHorizontalBarcode = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DynamicContentBarcodeKt$DynamicContentBarcode$4$3$1(this.$barcodeBitmap, this.$isQr, this.$model, this.$qrCodeSize, this.$barcodeWidth, this.$barcodeHeight, this.$isHorizontalBarcode, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DynamicContentBarcodeKt$DynamicContentBarcode$4$3$1 dynamicContentBarcodeKt$DynamicContentBarcode$4$3$1 = (DynamicContentBarcodeKt$DynamicContentBarcode$4$3$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        dynamicContentBarcodeKt$DynamicContentBarcode$4$3$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap createBitmap;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Bitmap bitmap = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        oz40 oz40Var = this.$barcodeBitmap;
        boolean z = this.$isQr;
        o5n o5nVar = this.$model;
        if (z) {
            o4b1 o4b1Var = o5nVar.c;
            int i = this.$qrCodeSize;
            jv4 jv4Var = o4b1Var instanceof jv4 ? (jv4) o4b1Var : null;
            if (jv4Var != null) {
                String str = jv4Var.a;
                HashMap hashMap = new HashMap();
                hashMap.put(EncodeHintType.MARGIN, 1);
                vz5 a = new s5g0().a(str, BarcodeFormat.QR_CODE, i, i, hashMap);
                bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.RGB_565);
                for (int i2 = 0; i2 < i; i2++) {
                    for (int i3 = 0; i3 < i; i3++) {
                        bitmap.setPixel(i2, i3, a.b(i2, i3) ? -16777216 : -1);
                    }
                }
            }
        } else {
            o4b1 o4b1Var2 = o5nVar.c;
            int i4 = this.$barcodeWidth;
            int i5 = this.$barcodeHeight;
            boolean z2 = this.$isHorizontalBarcode;
            jv4 jv4Var2 = o4b1Var2 instanceof jv4 ? (jv4) o4b1Var2 : null;
            if (jv4Var2 != null) {
                ml40 ml40Var = new ml40();
                Map e = gw00.e(new Pair(EncodeHintType.MARGIN, 0));
                Pair pair = new Pair(1, Integer.valueOf(i5));
                try {
                    vz5 a2 = ml40Var.a(jv4Var2.a, BarcodeFormat.CODE_128, ((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), e);
                    int i6 = a2.b;
                    int i7 = a2.a;
                    int[] iArr = new int[i7 * i6];
                    for (int i8 = 0; i8 < i6; i8++) {
                        int i9 = i8 * i7;
                        for (int i10 = 0; i10 < i7; i10++) {
                            iArr[i9 + i10] = a2.b(i10, i8) ? -16777216 : -1;
                        }
                    }
                    Bitmap createBitmap2 = Bitmap.createBitmap(i7, i6, Bitmap.Config.ARGB_8888);
                    int i11 = a2.a;
                    createBitmap2.setPixels(iArr, 0, i11, 0, 0, i11, a2.b);
                    if (z2) {
                        int width = createBitmap2.getWidth();
                        int height = createBitmap2.getHeight();
                        Matrix matrix = new Matrix();
                        matrix.postScale(i4 / width, i5 / height);
                        createBitmap = Bitmap.createBitmap(createBitmap2, 0, 0, width, height, matrix, false);
                        createBitmap2.recycle();
                    } else {
                        int width2 = createBitmap2.getWidth();
                        int height2 = createBitmap2.getHeight();
                        Matrix matrix2 = new Matrix();
                        matrix2.postScale(i5 / width2, i4 / height2);
                        matrix2.postRotate(90.0f);
                        createBitmap = Bitmap.createBitmap(createBitmap2, 0, 0, width2, height2, matrix2, false);
                        createBitmap2.recycle();
                    }
                    bitmap = createBitmap;
                } catch (Throwable th) {
                    jgz jgzVar = jgz.a;
                    jgz.d(th, "Delivery barcode generation error", new Object[0]);
                }
            }
        }
        oz40Var.setValue(bitmap);
        return zy11.a;
    }
}
