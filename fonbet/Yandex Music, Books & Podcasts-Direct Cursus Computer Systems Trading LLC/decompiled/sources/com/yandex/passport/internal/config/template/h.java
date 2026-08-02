package com.yandex.passport.internal.config.template;

import defpackage.ff7;
import defpackage.hip;
import defpackage.vnj;
import defpackage.w3f;
import defpackage.wm6;
import defpackage.x3f;
import defpackage.zhp;
import java.io.FileInputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class h implements hip {
    public static final h a = new h();

    @Override // defpackage.hip
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // defpackage.hip
    public final Object b(Object obj, OutputStream outputStream, Continuation continuation) {
        w3f w3fVar = x3f.d;
        w3fVar.getClass();
        byte[] bytes = w3fVar.c(ff7.C(c.Companion.serializer()), (c) obj).getBytes(Charsets.UTF_8);
        bytes.getClass();
        outputStream.write(bytes);
        return Unit.a;
    }

    @Override // defpackage.hip
    public final Object c(FileInputStream fileInputStream, Continuation continuation) {
        try {
            w3f w3fVar = x3f.d;
            String m = kotlin.text.c.m(vnj.N(fileInputStream));
            w3fVar.getClass();
            return (c) w3fVar.b(ff7.C(c.Companion.serializer()), m);
        } catch (zhp e) {
            throw new wm6("Unable to read UrlTemplateList.", e);
        }
    }
}
