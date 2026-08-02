package com.plaid.internal;

import com.plaid.internal.C0231m6;
import com.plaid.internal.C0290t3;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class W0 implements C0290t3.a {
    public final C0231m6.b a;
    public final C0231m6.c b;

    public W0(C0231m6.b bVar, C0231m6.c cVar) {
        bVar.getClass();
        cVar.getClass();
        this.a = bVar;
        this.b = cVar;
    }

    @Override // com.plaid.internal.C0290t3.a
    public final void a(LinkEvent linkEvent, I2 i2) {
        linkEvent.getClass();
        i2.getClass();
        this.a.invoke(linkEvent, i2);
    }

    @Override // com.plaid.internal.C0290t3.a
    public final void b(String str) {
        str.getClass();
    }

    @Override // com.plaid.internal.C0290t3.a
    public final void c(String str) {
        str.getClass();
        this.b.invoke();
    }

    @Override // com.plaid.internal.C0290t3.a
    public final void a(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        this.b.invoke();
    }

    @Override // com.plaid.internal.C0290t3.a
    public final void a(LinkSuccess linkSuccess) {
        linkSuccess.getClass();
        this.b.invoke();
    }

    @Override // com.plaid.internal.C0290t3.a
    public final void a(C0090a1 c0090a1) {
        c0090a1.getClass();
        this.b.invoke();
    }

    @Override // com.plaid.internal.C0290t3.a
    public final void a(LinkExit linkExit) {
        linkExit.getClass();
        this.b.invoke();
    }

    @Override // com.plaid.internal.C0290t3.a
    public final void a(String str, LinkEventMetadata linkEventMetadata) {
        str.getClass();
        linkEventMetadata.getClass();
        this.b.invoke();
    }
}
