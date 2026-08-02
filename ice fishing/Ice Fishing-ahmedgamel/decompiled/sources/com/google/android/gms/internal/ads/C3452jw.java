package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.jw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3452jw {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f32129b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f32130a = new ArrayList();

    public final void a(View view, Xv xv) {
        C3398iw c3398iw;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f32129b.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        ArrayList arrayList = this.f32130a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                c3398iw = null;
                break;
            } else {
                c3398iw = (C3398iw) it.next();
                if (c3398iw.f31920a.get() == view) {
                    break;
                }
            }
        }
        if (c3398iw == null) {
            arrayList.add(new C3398iw(view, xv));
        }
    }
}
