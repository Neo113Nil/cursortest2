package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.masstransit.model.VariantStyle;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsiu0;", "", "Companion", "qiu0", "riu0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class siu0 {
    public static final riu0 Companion = new riu0();
    public final VariantStyle.b a;
    public final float b;
    public final String c;

    public /* synthetic */ siu0(int i, VariantStyle.b bVar, float f, String str) {
        this.a = (i & 1) == 0 ? new VariantStyle.b(3) : bVar;
        if ((i & 2) == 0) {
            this.b = 1.0f;
        } else {
            this.b = f;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public siu0() {
        this((VariantStyle.b) null, 0.0f, 7);
    }

    public siu0(VariantStyle.b bVar, float f, String str) {
        this.a = bVar;
        this.b = f;
        this.c = str;
    }

    public /* synthetic */ siu0(VariantStyle.b bVar, float f, int i) {
        this((i & 1) != 0 ? new VariantStyle.b(3) : bVar, (i & 2) != 0 ? 1.0f : f, (String) null);
    }
}
