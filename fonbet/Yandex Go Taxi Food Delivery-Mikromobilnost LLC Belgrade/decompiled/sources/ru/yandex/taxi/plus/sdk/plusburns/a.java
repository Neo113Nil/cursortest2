package ru.yandex.taxi.plus.sdk.plusburns;

import defpackage.ho11;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.plus.repository.f;

/* loaded from: classes6.dex */
public final class a implements ho11 {
    public final tt2 a;
    public final f b;

    public a(tt2 tt2Var, f fVar) {
        this.a = tt2Var;
        this.b = fVar;
    }

    @Override // defpackage.ho11
    public final Object a(Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new PlusBurnsInteractor$getData$2(this, null), continuation);
    }
}
