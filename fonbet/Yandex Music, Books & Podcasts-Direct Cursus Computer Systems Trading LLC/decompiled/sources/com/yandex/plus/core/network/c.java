package com.yandex.plus.core.network;

import defpackage.q5g;
import defpackage.swf;
import defpackage.twh;
import defpackage.uj6;
import defpackage.vao;
import defpackage.vj6;
import defpackage.x3f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class c extends uj6 {
    public final x3f a;
    public final twh b;

    public c(x3f x3fVar) {
        Pattern pattern = twh.e;
        twh C = q5g.C("application/json");
        x3fVar.getClass();
        this.a = x3fVar;
        this.b = C;
    }

    @Override // defpackage.uj6
    public final vj6 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, vao vaoVar) {
        type.getClass();
        annotationArr2.getClass();
        x3f x3fVar = this.a;
        return new d(this.b, swf.h0(x3fVar.b, type), x3fVar);
    }

    @Override // defpackage.uj6
    public final vj6 b(Type type, Annotation[] annotationArr, vao vaoVar) {
        annotationArr.getClass();
        x3f x3fVar = this.a;
        return new a(swf.h0(x3fVar.b, type), x3fVar);
    }
}
