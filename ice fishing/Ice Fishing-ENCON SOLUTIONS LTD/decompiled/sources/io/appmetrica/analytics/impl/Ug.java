package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class Ug {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5168a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0285al f5169b;

    /* renamed from: c, reason: collision with root package name */
    public final C0611nb f5170c = new C0611nb();

    /* renamed from: d, reason: collision with root package name */
    public final C0656p4 f5171d = new C0656p4(new Zl(), new C0630o4(), null);

    /* renamed from: e, reason: collision with root package name */
    public final Consumer f5172e;

    public Ug(Context context, final InterfaceC0348d6 interfaceC0348d6, final EnumC0301bb enumC0301bb, InterfaceC0285al interfaceC0285al) {
        this.f5168a = context;
        this.f5169b = interfaceC0285al;
        this.f5172e = new Consumer() { // from class: io.appmetrica.analytics.impl.To
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Ug.a(EnumC0301bb.this, interfaceC0348d6, this, (C0507jb) obj);
            }
        };
    }

    public static final void a(EnumC0301bb enumC0301bb, InterfaceC0348d6 interfaceC0348d6, Ug ug, C0507jb c0507jb) {
        String str = c0507jb.f6274h;
        P3 p3 = new P3(str, c0507jb.f6271e, c0507jb.f6272f, c0507jb.f6273g, c0507jb.f6275i);
        String str2 = c0507jb.f6268b;
        byte[] bArr = c0507jb.f6267a;
        int i2 = c0507jb.f6269c;
        HashMap hashMap = c0507jb.f6270d;
        String str3 = c0507jb.f6276j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        Set set = AbstractC0842w9.f7096a;
        M3 m3 = new M3(bArr, str2, enumC0301bb.f5664a, orCreatePublicLogger);
        m3.f4729q = hashMap;
        m3.f4910g = i2;
        m3.f4906c = str3;
        ((Sg) interfaceC0348d6).a(p3, m3, ug.f5171d);
    }
}
