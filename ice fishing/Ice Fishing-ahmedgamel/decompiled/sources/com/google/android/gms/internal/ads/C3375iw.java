package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.iw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3375iw {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f31135b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f31136a = new ArrayList();

    public final void a(View view, Wv wv) {
        C3323hw c3323hw;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f31135b.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        ArrayList arrayList = this.f31136a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                c3323hw = null;
                break;
            } else {
                c3323hw = (C3323hw) it.next();
                if (c3323hw.f30970a.get() == view) {
                    break;
                }
            }
        }
        if (c3323hw == null) {
            arrayList.add(new C3323hw(view, wv));
        }
    }
}
