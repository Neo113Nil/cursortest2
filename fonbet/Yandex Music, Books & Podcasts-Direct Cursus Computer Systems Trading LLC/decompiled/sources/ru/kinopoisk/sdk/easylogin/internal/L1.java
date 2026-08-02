package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.g4f;
import defpackage.quj;
import defpackage.uif;
import defpackage.x3f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class L1 {

    @NotNull
    public static final x3f a = quj.r(x3f.d, a.a);

    public static final class a extends uif implements Function1<g4f, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            g4f g4fVar = (g4f) obj;
            g4fVar.getClass();
            g4fVar.c = true;
            g4fVar.e = true;
            g4fVar.b = false;
            g4fVar.g = true;
            return Unit.a;
        }
    }
}
