package com.anythink.expressad.atsignalcommon.c;

import com.anythink.core.common.d.j;
import com.anythink.expressad.atsignalcommon.c.c;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private static final long f17952a = 1;

    /* renamed from: b, reason: collision with root package name */
    private List<c.b.a> f17953b;

    private a(String str) {
        super(str);
        this.f17953b = new ArrayList();
    }

    private void a(c.b.a aVar) {
        this.f17953b.add(aVar);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (c.b.a aVar : this.f17953b) {
            sb.append(aVar.toString());
            sb.append(";");
            try {
                int i = 0;
                if (aVar.getCause() instanceof NoSuchFieldException) {
                    Field[] declaredFields = aVar.a().getDeclaredFields();
                    sb.append(aVar.a().getName());
                    sb.append(j.f12378z);
                    sb.append(aVar.c());
                    sb.append(";");
                    while (i < declaredFields.length) {
                        sb.append(declaredFields[i].getName());
                        sb.append("/");
                        i++;
                    }
                } else if (aVar.getCause() instanceof NoSuchMethodException) {
                    Method[] declaredMethods = aVar.a().getDeclaredMethods();
                    sb.append(aVar.a().getName());
                    sb.append("->");
                    sb.append(aVar.b());
                    sb.append(";");
                    while (i < declaredMethods.length) {
                        if (aVar.b().equals(declaredMethods[i].getName())) {
                            sb.append(declaredMethods[i].toGenericString());
                            sb.append("/");
                        }
                        i++;
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            sb.append("@@@@");
        }
        return sb.toString();
    }

    private void a(List<c.b.a> list) {
        this.f17953b.addAll(list);
    }

    private List<c.b.a> a() {
        return this.f17953b;
    }

    private static a a(a aVar, a aVar2) {
        if (aVar == null) {
            return aVar2;
        }
        if (aVar2 == null) {
            return aVar;
        }
        a aVar3 = new a(aVar.getMessage() + ";" + aVar2.getMessage());
        aVar3.a(aVar.f17953b);
        aVar3.a(aVar2.f17953b);
        return aVar3;
    }
}
