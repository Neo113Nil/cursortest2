package defpackage;

import java.util.Collections;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.taxi.logistics.sdk.management.f;
import ru.yandex.taxi.logistics.sdk.management.localstate.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.data.ButtonType;
import ru.yandex.taxi.logistics.sdk.tracking.impl.data.c;

/* loaded from: classes5.dex */
public final class qyc {
    public final String a;
    public final x201 b;
    public final kcz0 c;
    public final c d;
    public final y47 e;
    public final e f;
    public final f g;
    public final ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e h;

    public qyc(String str, x201 x201Var, kcz0 kcz0Var, c cVar, y47 y47Var, e eVar, f fVar, ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e eVar2) {
        this.a = str;
        this.b = x201Var;
        this.c = kcz0Var;
        this.d = cVar;
        this.e = y47Var;
        this.f = eVar;
        this.g = fVar;
        this.h = eVar2;
    }

    public final void a(ButtonType buttonType, String str) {
        String str2;
        int i = pyc.a[buttonType.ordinal()];
        if (i == 1) {
            str2 = "primary_button";
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            str2 = "secondary_button";
        }
        this.c.x("SharedOrderCard.Tapped", b.i(new Pair("button_name", str2), new Pair("button_action", str)));
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [oyc] */
    /* JADX WARN: Type inference failed for: r1v3, types: [oyc] */
    /* JADX WARN: Type inference failed for: r6v2, types: [oyc] */
    /* JADX WARN: Type inference failed for: r8v1, types: [oyc] */
    public final void b(az6 az6Var, final ButtonType buttonType) {
        boolean z = az6Var instanceof uy6;
        String str = this.a;
        e eVar = this.f;
        c cVar = this.d;
        x201 x201Var = this.b;
        if (z) {
            a(buttonType, "done");
            cVar.a();
            eVar.c(str, "done_clicked");
            x201Var.a(new y3m(((uy6) az6Var).a));
            return;
        }
        if (az6Var instanceof vy6) {
            Boolean bool = ((vy6) az6Var).a;
            a(buttonType, bool.equals(Boolean.TRUE) ? "change_payment_method" : "go_to_summary");
            cVar.a();
            eVar.c(str, "go_to_summary_clicked");
            x201Var.a(new xrt(bool.booleanValue()));
            return;
        }
        final int i = 1;
        if (az6Var instanceof wy6) {
            final int i2 = 0;
            x201Var.a(new j970(((wy6) az6Var).a, new nyc(this, 0), new sls(this) { // from class: oyc
                public final /* synthetic */ qyc b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    int i3 = i2;
                    zy11 zy11Var = zy11.a;
                    ButtonType buttonType2 = buttonType;
                    qyc qycVar = this.b;
                    switch (i3) {
                        case 0:
                            qycVar.e.a(Collections.singletonList(buttonType2), true);
                            break;
                        case 1:
                            qycVar.e.a(Collections.singletonList(buttonType2), false);
                            break;
                        case 2:
                            qycVar.e.a(Collections.singletonList(buttonType2), true);
                            break;
                        default:
                            qycVar.e.a(Collections.singletonList(buttonType2), false);
                            break;
                    }
                    return zy11Var;
                }
            }, new sls(this) { // from class: oyc
                public final /* synthetic */ qyc b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    int i3 = i;
                    zy11 zy11Var = zy11.a;
                    ButtonType buttonType2 = buttonType;
                    qyc qycVar = this.b;
                    switch (i3) {
                        case 0:
                            qycVar.e.a(Collections.singletonList(buttonType2), true);
                            break;
                        case 1:
                            qycVar.e.a(Collections.singletonList(buttonType2), false);
                            break;
                        case 2:
                            qycVar.e.a(Collections.singletonList(buttonType2), true);
                            break;
                        default:
                            qycVar.e.a(Collections.singletonList(buttonType2), false);
                            break;
                    }
                    return zy11Var;
                }
            }));
        } else if (!(az6Var instanceof xy6)) {
            if (az6Var instanceof yy6) {
                return;
            }
            w511.b();
        } else {
            xy6 xy6Var = (xy6) az6Var;
            a(buttonType, "safe_flow");
            final int i3 = 2;
            final int i4 = 3;
            x201Var.a(new qol0(xy6Var.a, xy6Var.b.b, new n8a(28, this, xy6Var), new nyc(this, 1), new nyc(this, 2), new sls(this) { // from class: oyc
                public final /* synthetic */ qyc b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    int i32 = i3;
                    zy11 zy11Var = zy11.a;
                    ButtonType buttonType2 = buttonType;
                    qyc qycVar = this.b;
                    switch (i32) {
                        case 0:
                            qycVar.e.a(Collections.singletonList(buttonType2), true);
                            break;
                        case 1:
                            qycVar.e.a(Collections.singletonList(buttonType2), false);
                            break;
                        case 2:
                            qycVar.e.a(Collections.singletonList(buttonType2), true);
                            break;
                        default:
                            qycVar.e.a(Collections.singletonList(buttonType2), false);
                            break;
                    }
                    return zy11Var;
                }
            }, new sls(this) { // from class: oyc
                public final /* synthetic */ qyc b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    int i32 = i4;
                    zy11 zy11Var = zy11.a;
                    ButtonType buttonType2 = buttonType;
                    qyc qycVar = this.b;
                    switch (i32) {
                        case 0:
                            qycVar.e.a(Collections.singletonList(buttonType2), true);
                            break;
                        case 1:
                            qycVar.e.a(Collections.singletonList(buttonType2), false);
                            break;
                        case 2:
                            qycVar.e.a(Collections.singletonList(buttonType2), true);
                            break;
                        default:
                            qycVar.e.a(Collections.singletonList(buttonType2), false);
                            break;
                    }
                    return zy11Var;
                }
            }));
        }
    }
}
