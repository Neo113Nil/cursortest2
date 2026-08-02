package com.google.gson.internal;

import defpackage.hrg;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ReflectionAccessFilterHelper {
    public static void a(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw hrg.j(it);
        }
    }
}
