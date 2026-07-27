package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.kw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3496kw {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f32486b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f32487a = new ArrayList();

    public final void a(View view, Yv yv) {
        C3442jw c3442jw;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f32486b.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        ArrayList arrayList = this.f32487a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                c3442jw = null;
                break;
            } else {
                c3442jw = (C3442jw) it.next();
                if (c3442jw.f32218a.get() == view) {
                    break;
                }
            }
        }
        if (c3442jw == null) {
            arrayList.add(new C3442jw(view, yv));
        }
    }
}
