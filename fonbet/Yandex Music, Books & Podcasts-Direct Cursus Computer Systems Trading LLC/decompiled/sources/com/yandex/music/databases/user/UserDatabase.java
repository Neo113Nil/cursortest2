package com.yandex.music.databases.user;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.ada;
import defpackage.hb2;
import defpackage.i3t;
import defpackage.k5l;
import defpackage.lou;
import defpackage.msa;
import defpackage.nsa;
import defpackage.s10;
import defpackage.ssa;
import defpackage.ueo;
import defpackage.w1l;
import defpackage.yd5;
import defpackage.yga;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/music/databases/user/UserDatabase;", "Lueo;", "<init>", "()V", "shared-integration-databases"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public abstract class UserDatabase extends ueo {
    public static final long n;

    static {
        msa msaVar = nsa.b;
        n = yd5.M(60, ssa.SECONDS);
    }

    public abstract k5l A();

    public abstract i3t B();

    public abstract lou C();

    public abstract s10 v();

    public abstract hb2 w();

    public abstract ada x();

    public abstract yga y();

    public abstract w1l z();
}
