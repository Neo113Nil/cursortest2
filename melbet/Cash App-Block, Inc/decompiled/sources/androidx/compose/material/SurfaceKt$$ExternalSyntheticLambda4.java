package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import com.squareup.cash.offers.viewmodels.FormattedDetailViewModel;
import com.squareup.cash.offers.views.UtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class SurfaceKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ float f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ int f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ SurfaceKt$$ExternalSyntheticLambda4(Modifier modifier, Shape shape, long j, long j2, BorderStroke borderStroke, float f, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.f$0 = modifier;
        this.f$1 = shape;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$4 = borderStroke;
        this.f$5 = f;
        this.f$6 = composableLambdaImpl;
        this.f$7 = i;
        this.f$8 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$7;
        Object obj3 = this.f$6;
        Object obj4 = this.f$4;
        Object obj5 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                CardKt.m472SurfaceFjzlyU(this.f$0, (Shape) obj5, this.f$2, this.f$3, (BorderStroke) obj4, this.f$5, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags, this.f$8);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                UtilsKt.m3676OffersFormattedDetailNLbO3rw((FormattedDetailViewModel) obj5, this.f$0, (TextStyle) obj4, this.f$2, (String) obj3, this.f$3, this.f$5, (Composer) obj, updateChangedFlags2, this.f$8);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SurfaceKt$$ExternalSyntheticLambda4(FormattedDetailViewModel formattedDetailViewModel, Modifier modifier, TextStyle textStyle, long j, String str, long j2, float f, int i, int i2) {
        this.f$1 = formattedDetailViewModel;
        this.f$0 = modifier;
        this.f$4 = textStyle;
        this.f$2 = j;
        this.f$6 = str;
        this.f$3 = j2;
        this.f$5 = f;
        this.f$7 = i;
        this.f$8 = i2;
    }
}
