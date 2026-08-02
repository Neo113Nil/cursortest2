package com.yandex.plus.bdui.plus.utils;

import com.yandex.passport.internal.ui.bouncer.o;
import defpackage.btf;
import defpackage.dfi;
import defpackage.eg7;
import defpackage.jyr;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.quj;
import defpackage.s4f;
import defpackage.t9f;
import defpackage.uhp;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class a implements t9f {
    public final t9f a;
    public final com.yandex.plus.log.api.b b;
    public final String c;
    public final jyr d;

    public a(Function0 function0, t9f t9fVar, com.yandex.plus.log.api.b bVar, String str) {
        function0.getClass();
        t9fVar.getClass();
        bVar.getClass();
        this.a = t9fVar;
        this.b = bVar;
        this.c = str;
        this.d = btf.b(function0);
    }

    public final void a() {
        throw new UnsupportedOperationException(this.c.concat(" does not support serialize()!"));
    }

    public abstract Object b(l6b l6bVar, Object obj);

    public abstract Object c(Object obj, eg7 eg7Var);

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r2 != null) goto L30;
     */
    @Override // defpackage.t9f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deserialize(eg7 eg7Var) {
        Object e;
        eg7Var.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.b;
        boolean b = bVar.b(aVar);
        String str = this.c;
        if (b) {
            bVar.c(aVar, str, "deserialize()...");
        }
        s4f s4fVar = eg7Var instanceof s4f ? (s4f) eg7Var : null;
        jyr jyrVar = this.d;
        t9f t9fVar = this.a;
        if (s4fVar != null) {
            uhp uhpVar = (uhp) jyrVar.getValue();
            if (bVar.b(aVar)) {
                bVar.c(aVar, str, "decodeAsJson()...");
            }
            try {
                e = quj.r(s4fVar.d(), new o(27, s4fVar, uhpVar)).a(t9fVar, s4fVar.f());
            } catch (Throwable th) {
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                if (bVar.b(aVar2)) {
                    bVar.a(aVar2, str, "decodeAsJson() failed!", th);
                }
                throw th;
            }
        }
        if (bVar.b(aVar)) {
            bVar.c(aVar, str, "wrapDecoder()");
        }
        if (bVar.b(aVar)) {
            bVar.c(aVar, str, "decodeByDecoder()...");
        }
        try {
            t9f t9fVar2 = t9fVar;
            t9fVar2.getClass();
            e = eg7Var.e(t9fVar2);
            if (bVar.b(aVar)) {
                bVar.c(aVar, str, "deserialize(); dto = " + e);
            }
            try {
                Object c = c(e, eg7Var);
                if (bVar.b(aVar)) {
                    bVar.c(aVar, str, "deserialize() succeeded: value = " + c);
                }
                return c;
            } catch (Throwable th2) {
                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
                if (bVar.b(aVar3)) {
                    bVar.a(aVar3, str, "deserialize() failed!", th2);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.e;
            if (bVar.b(aVar4)) {
                bVar.a(aVar4, str, "decodeByDecoder() failed!", th3);
            }
            throw th3;
        }
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l6bVar.getClass();
        obj.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.b;
        boolean b = bVar.b(aVar);
        String str = this.c;
        if (b) {
            bVar.c(aVar, str, dfi.g("serialize(); value = ", "...", obj));
        }
        try {
            Object b2 = b(l6bVar, obj);
            if (bVar.b(aVar)) {
                bVar.c(aVar, str, "serialize(); dto = " + b2);
            }
            try {
                l6bVar.v(this.a, b2);
                if (bVar.b(aVar)) {
                    bVar.c(aVar, str, "serialize() succeeded");
                }
            } finally {
            }
        } finally {
        }
    }
}
