package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4106w2 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f35555a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f35556b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (AbstractC4106w2.class) {
            if (f35555a.add(str)) {
                String str2 = f35556b;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
                sb.append(str2);
                sb.append(", ");
                sb.append(str);
                f35556b = sb.toString();
            }
        }
    }
}
