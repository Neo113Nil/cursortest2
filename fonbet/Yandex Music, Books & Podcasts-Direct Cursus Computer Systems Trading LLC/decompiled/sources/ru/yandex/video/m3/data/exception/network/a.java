package ru.yandex.video.m3.data.exception.network;

import defpackage.tqn;
import defpackage.uif;
import defpackage.xqn;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes6.dex */
public final class a extends uif implements Function1 {
    public final /* synthetic */ xqn r;
    public final /* synthetic */ xqn s;
    public final /* synthetic */ xqn t;
    public final /* synthetic */ ManifestLoadingException u;
    public final /* synthetic */ tqn v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xqn xqnVar, xqn xqnVar2, xqn xqnVar3, ManifestLoadingException manifestLoadingException, tqn tqnVar) {
        super(1);
        this.r = xqnVar;
        this.s = xqnVar2;
        this.t = xqnVar3;
        this.u = manifestLoadingException;
        this.v = tqnVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c cVar = (c) obj;
        cVar.getClass();
        cVar.a = (Integer) this.r.a;
        cVar.b = (String) this.s.a;
        NetworkRequestException.ResourceType resourceType = NetworkRequestException.ResourceType.CONTENT_ID;
        resourceType.getClass();
        cVar.d = resourceType;
        cVar.e = (String) this.t.a;
        cVar.f = this.u.getCause();
        cVar.g = this.v.a;
        return Unit.a;
    }
}
