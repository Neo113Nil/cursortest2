package ru.yandex.taxi.common_models.net.map_object;

import defpackage.dtd0;
import defpackage.gsq0;
import defpackage.rtd0;
import defpackage.utd0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/a0;", "Lru/yandex/taxi/common_models/net/map_object/l;", "Companion", "rtd0", "qtd0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a0 extends l {
    public static final rtd0 Companion = new rtd0();
    public static final a0 e = new a0(0);
    public final FormattedText a;
    public final FormattedText b;
    public final dtd0 c;
    public final utd0 d;

    public a0(int i, FormattedText formattedText, FormattedText formattedText2, dtd0 dtd0Var, utd0 utd0Var) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            dtd0.Companion.getClass();
            this.c = dtd0.b;
        } else {
            this.c = dtd0Var;
        }
        if ((i & 8) != 0) {
            this.d = utd0Var;
        } else {
            utd0.Companion.getClass();
            this.d = utd0.d;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.l
    public final AdjustmentScreenType a() {
        return AdjustmentScreenType.POINT_ADJUSTMENT;
    }

    public a0() {
        this(0);
    }

    public a0(int i) {
        FormattedText formattedText = FormattedText.c;
        dtd0.Companion.getClass();
        dtd0 dtd0Var = dtd0.b;
        utd0.Companion.getClass();
        utd0 utd0Var = utd0.d;
        this.a = formattedText;
        this.b = null;
        this.c = dtd0Var;
        this.d = utd0Var;
    }
}
