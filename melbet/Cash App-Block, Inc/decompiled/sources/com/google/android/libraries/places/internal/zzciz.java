package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzciz implements InvocationHandler {
    public final ArrayList zza;
    public boolean zzb;
    public String zzc;

    public zzciz(ArrayList arrayList) {
        this.zza = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = zzcjd.zza;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.zzb = true;
            return null;
        }
        boolean equals = name.equals("protocols");
        ArrayList arrayList = this.zza;
        if (equals && objArr.length == 0) {
            return arrayList;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && returnType == String.class && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.contains(list.get(i))) {
                        String str = (String) list.get(i);
                        this.zzc = str;
                        return str;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.zzc = str2;
                return str2;
            }
        }
        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.zzc = (String) objArr[0];
        return null;
    }
}
