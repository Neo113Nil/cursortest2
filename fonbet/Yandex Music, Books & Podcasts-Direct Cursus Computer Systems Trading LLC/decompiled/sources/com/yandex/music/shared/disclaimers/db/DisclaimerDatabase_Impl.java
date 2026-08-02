package com.yandex.music.shared.disclaimers.db;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.disclaimers.db.DisclaimerDatabase_Impl;
import defpackage.b58;
import defpackage.btf;
import defpackage.c58;
import defpackage.c5b;
import defpackage.e58;
import defpackage.ern;
import defpackage.iye;
import defpackage.jyr;
import defpackage.lm4;
import defpackage.m68;
import defpackage.t51;
import defpackage.yeo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/music/shared/disclaimers/db/DisclaimerDatabase_Impl;", "Lcom/yandex/music/shared/disclaimers/db/DisclaimerDatabase;", "<init>", "()V", "shared-disclaimers"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class DisclaimerDatabase_Impl extends DisclaimerDatabase {
    public final jyr n;
    public final jyr o;

    public DisclaimerDatabase_Impl() {
        final int i = 0;
        this.n = btf.b(new Function0(this) { // from class: d58
            public final /* synthetic */ DisclaimerDatabase_Impl b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new t51(this.b);
                    default:
                        return new m68(this.b);
                }
            }
        });
        final int i2 = 1;
        this.o = btf.b(new Function0(this) { // from class: d58
            public final /* synthetic */ DisclaimerDatabase_Impl b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new t51(this.b);
                    default:
                        return new m68(this.b);
                }
            }
        });
    }

    @Override // defpackage.ueo
    public final List c(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b58(0));
        arrayList.add(new c58(2, 3, 0));
        return arrayList;
    }

    @Override // defpackage.ueo
    public final iye d() {
        return new iye(this, new LinkedHashMap(), new LinkedHashMap(), "artistDisclaimers", "disclaimers");
    }

    @Override // defpackage.ueo
    public final yeo e() {
        return new e58(this);
    }

    @Override // defpackage.ueo
    public final Set k() {
        return new LinkedHashSet();
    }

    @Override // defpackage.ueo
    public final LinkedHashMap m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        lm4 a = ern.a(t51.class);
        c5b c5bVar = c5b.a;
        linkedHashMap.put(a, c5bVar);
        linkedHashMap.put(ern.a(m68.class), c5bVar);
        return linkedHashMap;
    }

    @Override // com.yandex.music.shared.disclaimers.db.DisclaimerDatabase
    public final t51 v() {
        return (t51) this.n.getValue();
    }

    @Override // com.yandex.music.shared.disclaimers.db.DisclaimerDatabase
    public final m68 w() {
        return (m68) this.o.getValue();
    }
}
