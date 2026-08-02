package com.yandex.plus.home.internal.di;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.q5b;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class v implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ v(z zVar, int i) {
        this.a = i;
        this.b = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(r1.l(((com.yandex.plus.home.featureflags.e) this.b.a.q).j));
            case 1:
                Set set = (Set) ((com.yandex.plus.home.featureflags.e) this.b.a.q).p.getValue();
                return set == null ? q5b.a : set;
            case 2:
                Set set2 = (Set) ((com.yandex.plus.home.featureflags.e) this.b.a.q).q.getValue();
                return set2 == null ? q5b.a : set2;
            case 3:
                Set set3 = (Set) ((com.yandex.plus.home.featureflags.e) this.b.a.q).r.getValue();
                return set3 == null ? q5b.a : set3;
            case 4:
                com.yandex.plus.home.featureflags.g gVar = this.b.a.q;
                gVar.getClass();
                Set set4 = (Set) ((com.yandex.plus.home.featureflags.e) gVar).o.getValue();
                if (set4 != null) {
                    return set4;
                }
                com.yandex.plus.home.featureflags.g.a.getClass();
                return (Set) com.yandex.plus.home.featureflags.f.b.getValue();
            case 5:
                return this.b.a.l.e();
            case 6:
                return this.b.a.l.f();
            case 7:
                return Boolean.valueOf(r1.l(((com.yandex.plus.home.featureflags.e) this.b.a.q).A));
            case 8:
                return Boolean.valueOf(r1.l(((com.yandex.plus.home.featureflags.e) this.b.a.q).x));
            case 9:
                return Boolean.valueOf(r1.l(((com.yandex.plus.home.featureflags.e) this.b.a.q).z));
            case 10:
                return Boolean.valueOf(r1.l(((com.yandex.plus.home.featureflags.e) this.b.a.q).y));
            case 11:
                u uVar = this.b.a;
                return Boolean.valueOf(r1.l(((com.yandex.plus.home.featureflags.e) uVar.q).B) && r1.l(((com.yandex.plus.home.featureflags.e) uVar.q).A));
            case 12:
                u uVar2 = this.b.a;
                return Boolean.valueOf(r1.l(((com.yandex.plus.home.featureflags.e) uVar2.q).B) && r1.l(((com.yandex.plus.home.featureflags.e) uVar2.q).x));
            case 13:
                u uVar3 = this.b.a;
                return Boolean.valueOf(r1.l(((com.yandex.plus.home.featureflags.e) uVar3.q).B) && r1.l(((com.yandex.plus.home.featureflags.e) uVar3.q).z));
            case 14:
                return (Integer) ((com.yandex.plus.home.featureflags.e) this.b.a.q).n.getValue();
            case 15:
                com.yandex.plus.home.featureflags.g gVar2 = this.b.a.q;
                gVar2.getClass();
                Integer num = (Integer) ((com.yandex.plus.home.featureflags.e) gVar2).s.getValue();
                return Integer.valueOf(num != null ? num.intValue() : 40);
            case 16:
                com.yandex.plus.home.featureflags.g gVar3 = this.b.a.q;
                gVar3.getClass();
                Integer num2 = (Integer) ((com.yandex.plus.home.featureflags.e) gVar3).t.getValue();
                return Integer.valueOf(num2 != null ? num2.intValue() : 80);
            default:
                return Boolean.valueOf(r1.l(((com.yandex.plus.home.featureflags.e) this.b.a.q).C));
        }
    }
}
