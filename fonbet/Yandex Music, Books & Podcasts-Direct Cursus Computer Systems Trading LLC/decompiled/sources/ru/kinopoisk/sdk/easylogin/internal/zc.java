package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.agr;
import defpackage.ges;
import defpackage.gld;
import defpackage.nuk;
import defpackage.ozm;
import defpackage.qpc;
import defpackage.t2o;
import defpackage.tqc;
import defpackage.uif;
import defpackage.v7g;
import defpackage.vwb;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.R;

/* loaded from: classes5.dex */
public final class zc {

    @NotNull
    public static final qpc a;

    @NotNull
    public static final ozm b;

    public static final class a extends uif implements Function0<yc> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new yc(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 32767, null);
        }
    }

    static {
        t2o q = gld.q(R.font.yango_headline, tqc.q, 0, 12);
        a = vwb.s(gld.q(R.font.kinopoisk_bold, tqc.p, 0, 12), gld.q(R.font.kinopoisk_semibold, tqc.o, 0, 12), gld.q(R.font.kinopoisk_medium, tqc.n, 0, 12), gld.q(R.font.kinopoisk_regular, tqc.m, 0, 12));
        new ges(0L, v7g.z(32), null, null, null, vwb.s(q), null, 0L, null, 0, v7g.z(32), new nuk(true), null, 0, 16056285);
        new ges(0L, v7g.z(32), null, null, null, vwb.s(q), null, 0L, null, 0, v7g.z(32), null, null, 0, 16580573);
        new ges(0L, v7g.z(28), null, null, null, vwb.s(q), null, 0L, null, 0, v7g.z(28), null, null, 0, 16580573);
        b = new agr(a.a);
    }

    @NotNull
    public static final ozm a() {
        return b;
    }

    @NotNull
    public static final qpc b() {
        return a;
    }
}
