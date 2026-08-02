package defpackage;

import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class ih1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArtistScreenActivity b;

    public /* synthetic */ ih1(ArtistScreenActivity artistScreenActivity, int i) {
        this.a = i;
        this.b = artistScreenActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ArtistScreenActivity artistScreenActivity = this.b;
        switch (i) {
            case 0:
                int i2 = ArtistScreenActivity.w0;
                Parcelable parcelableExtra = artistScreenActivity.getIntent().getParcelableExtra("extra.artist.params");
                lh1 lh1Var = parcelableExtra instanceof lh1 ? (lh1) parcelableExtra : null;
                if (lh1Var == null) {
                    return null;
                }
                return new lh1(lh1Var.a, lh1Var.b, lh1Var.c, lh1Var.d);
            default:
                int i3 = ArtistScreenActivity.w0;
                artistScreenActivity.z();
                return Unit.a;
        }
    }
}
