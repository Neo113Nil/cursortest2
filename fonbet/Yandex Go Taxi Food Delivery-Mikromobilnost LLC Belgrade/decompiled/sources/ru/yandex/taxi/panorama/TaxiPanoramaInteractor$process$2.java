package ru.yandex.taxi.panorama;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import defpackage.a8y0;
import defpackage.a9y0;
import defpackage.avj0;
import defpackage.c9y0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.myy;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.sls;
import defpackage.tb90;
import defpackage.tls;
import defpackage.vng;
import defpackage.wls;
import defpackage.yyg0;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.panorama.d;
import ru.yandex.taxi.panorama.l;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmyy;", "iconState", "Lzy11;", "<anonymous>", "(Lmyy;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.panorama.TaxiPanoramaInteractor$process$2", f = "TaxiPanoramaInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TaxiPanoramaInteractor$process$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $acceptPickupPointDescIconTag;
    final /* synthetic */ String $acceptPickupPointDescTitle;
    final /* synthetic */ d $experiment;
    final /* synthetic */ tls $movePinToGeoPoint;
    final /* synthetic */ RotatableFloatButton $panoramaButton;
    final /* synthetic */ tb90 $panoramaData;
    final /* synthetic */ String $pinType;
    final /* synthetic */ String $screen;
    final /* synthetic */ oep0 $screenStackNavigator;
    final /* synthetic */ a9y0 $taxiPanoramaRouter;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiPanoramaInteractor$process$2(RotatableFloatButton rotatableFloatButton, l lVar, tb90 tb90Var, String str, String str2, oep0 oep0Var, a9y0 a9y0Var, d dVar, String str3, String str4, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$panoramaButton = rotatableFloatButton;
        this.this$0 = lVar;
        this.$panoramaData = tb90Var;
        this.$screen = str;
        this.$pinType = str2;
        this.$screenStackNavigator = oep0Var;
        this.$taxiPanoramaRouter = a9y0Var;
        this.$experiment = dVar;
        this.$acceptPickupPointDescTitle = str3;
        this.$acceptPickupPointDescIconTag = str4;
        this.$movePinToGeoPoint = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiPanoramaInteractor$process$2 taxiPanoramaInteractor$process$2 = new TaxiPanoramaInteractor$process$2(this.$panoramaButton, this.this$0, this.$panoramaData, this.$screen, this.$pinType, this.$screenStackNavigator, this.$taxiPanoramaRouter, this.$experiment, this.$acceptPickupPointDescTitle, this.$acceptPickupPointDescIconTag, this.$movePinToGeoPoint, continuation);
        taxiPanoramaInteractor$process$2.L$0 = obj;
        return taxiPanoramaInteractor$process$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TaxiPanoramaInteractor$process$2 taxiPanoramaInteractor$process$2 = (TaxiPanoramaInteractor$process$2) create((myy) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        taxiPanoramaInteractor$process$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Resources resources;
        final myy myyVar = (myy) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (this.$panoramaButton != null && (!jl40.l(this.this$0.e.a, this.$panoramaData.a) || !jl40.l(this.this$0.e.b, this.$screen))) {
            a8y0 a8y0Var = this.this$0.a;
            tb90 tb90Var = this.$panoramaData;
            a8y0Var.c(tb90Var.a, this.$screen, this.$pinType, tb90Var.c);
        }
        l lVar = this.this$0;
        c9y0 c9y0Var = lVar.e;
        i3y i3yVar = lVar.j;
        c9y0Var.a = this.$panoramaData.a;
        c9y0Var.b = this.$screen;
        RotatableFloatButton rotatableFloatButton = this.$panoramaButton;
        Bitmap bitmap = myyVar.b;
        if (rotatableFloatButton != null && (resources = rotatableFloatButton.getResources()) != null) {
            zuj0 zuj0Var = lVar.f;
            if (bitmap == null) {
                rotatableFloatButton.setImageDrawable(vng.t(yyg0.panorama_button_text_main, ((avj0) zuj0Var).a));
                rotatableFloatButton.setImageSize(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                rotatableFloatButton.setEnableShadowBackground(true);
            } else {
                Drawable t = vng.t(yyg0.bg_panorama_expand_button, ((avj0) zuj0Var).a);
                LayerDrawable layerDrawable = t instanceof LayerDrawable ? (LayerDrawable) t : null;
                if (layerDrawable != null) {
                    float intValue = ((Number) lVar.k.getValue()).intValue();
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint();
                    Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    RectF rectF = new RectF(rect);
                    paint.setAntiAlias(true);
                    canvas.drawARGB(0, 0, 0, 0);
                    paint.setColor(-16777215);
                    canvas.drawRoundRect(rectF, intValue, intValue, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, rect, rect, paint);
                    layerDrawable.setDrawable(0, new BitmapDrawable(resources, createBitmap));
                    rotatableFloatButton.setImageDrawable(layerDrawable);
                    rotatableFloatButton.setImageSize(((Number) lVar.i.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                    rotatableFloatButton.setEnableShadowBackground(false);
                    rotatableFloatButton.invalidate();
                }
            }
        }
        RotatableFloatButton rotatableFloatButton2 = this.$panoramaButton;
        if (rotatableFloatButton2 != null) {
            RotatableFloatButton.show$default(rotatableFloatButton2, null, 1, null);
        }
        RotatableFloatButton rotatableFloatButton3 = this.$panoramaButton;
        if (rotatableFloatButton3 != null) {
            final l lVar2 = this.this$0;
            final tb90 tb90Var2 = this.$panoramaData;
            final String str = this.$screen;
            final String str2 = this.$pinType;
            final oep0 oep0Var = this.$screenStackNavigator;
            final a9y0 a9y0Var = this.$taxiPanoramaRouter;
            final d dVar = this.$experiment;
            final String str3 = this.$acceptPickupPointDescTitle;
            final String str4 = this.$acceptPickupPointDescIconTag;
            final tls tlsVar = this.$movePinToGeoPoint;
            ru.yandex.taxi.design.utils.c.z(new sls() { // from class: h8y0
                @Override // defpackage.sls
                public final Object invoke() {
                    l lVar3 = l.this;
                    a8y0 a8y0Var2 = lVar3.a;
                    tb90 tb90Var3 = tb90Var2;
                    String str5 = tb90Var3.a;
                    Double d = tb90Var3.c;
                    String str6 = str;
                    String str7 = str2;
                    a8y0Var2.d(str5, str6, str7, d);
                    ArrayList a = lVar3.c.a();
                    d dVar2 = dVar;
                    double d2 = dVar2.i;
                    d.C0109d c0109d = dVar2.m;
                    d.a aVar = dVar2.l;
                    Bitmap bitmap2 = myyVar.a;
                    boolean l = jl40.l(str7, "a");
                    d.b bVar = dVar2.k;
                    ((pep0) oep0Var).f(a9y0Var, new s8y0(tb90Var3, str6, str7, d2, bitmap2, l ? d6z.Y(dVar2, bVar.a) : d6z.Y(dVar2, bVar.b), a, d6z.Y(dVar2, aVar.a), d6z.Y(dVar2, aVar.b), d6z.Y(dVar2, c0109d.a), str3, str4, c0109d.f, tlsVar, c0109d.g), hxx.a);
                    return zy11.a;
                }
            }, rotatableFloatButton3);
        }
        return zy11.a;
    }
}
