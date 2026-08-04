package com.gamericefishpro.space.g1;

import com.gamericefishpro.space.ph.d0;
import com.gamericefishpro.space.ph.p0;
import com.gamericefishpro.space.ph.w;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends RuntimeException {
    public final a d;

    public h(a aVar) {
        this.d = aVar;
        if (aVar.a()) {
            return;
        }
        ArrayList arrayListT = com.gamericefishpro.space.wa.b.t(aVar);
        int size = arrayListT.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
        for (int i = 0; i < size; i++) {
            stackTraceElementArr[i] = new StackTraceElement("$$compose", "m$" + ((c) arrayListT.get(i)).a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        a aVar = this.d;
        if (!aVar.a()) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Composition stack when thrown:");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        int i = 0;
        if (aVar.a()) {
            com.gamericefishpro.space.qh.d dVarB = w.b();
            p0 p0VarO = d0.o(aVar.a);
            int iB = p0VarO.b();
            for (int i2 = 0; i2 < iB; i2++) {
                ((c) p0VarO.get(i2)).getClass();
            }
            p0 p0VarO2 = d0.o(w.a(dVarB));
            int iB2 = p0VarO2.b();
            while (i < iB2) {
                String str = (String) p0VarO2.get(i);
                sb.append("\tat ");
                sb.append(str);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
                sb.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
                i++;
            }
        } else {
            ArrayList arrayListT = com.gamericefishpro.space.wa.b.t(aVar);
            int size = arrayListT.size();
            while (i < size) {
                c cVar = (c) arrayListT.get(i);
                sb.append("\tat $$compose.m$");
                sb.append(cVar.a);
                sb.append("(SourceFile:1)");
                sb.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
                i++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
