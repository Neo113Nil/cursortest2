package ru.yandex.taxi.eatskit.internal;

import android.net.Uri;
import defpackage.ccn;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.gvu0;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class c extends ccn {
    public final boolean f;

    public c(String str, boolean z) {
        super("openUrl", str, false, EatsEvent$OpenUrl$1.b, !z);
        this.f = z;
    }

    @Override // defpackage.ccn
    public final void b(Uri.Builder builder) {
        if (this.f) {
            Uri parse = Uri.parse((String) this.b);
            String encodedPath = parse.getEncodedPath();
            if (encodedPath == null || encodedPath.length() == 0) {
                Uri build = builder.build();
                String encodedPath2 = build.getEncodedPath();
                if ((encodedPath2 == null || encodedPath2.length() == 0) && build.getHost() != null) {
                    builder.encodedPath("/");
                }
            } else {
                String encodedPath3 = builder.build().getEncodedPath();
                if (encodedPath3 == null) {
                    encodedPath3 = "";
                }
                if (cvu0.s(encodedPath3, "/", false) && cvu0.x(encodedPath, "/", false)) {
                    builder.encodedPath(gvu0.t0(1, encodedPath3).concat(encodedPath));
                } else {
                    if (cvu0.x(encodedPath, "/", false)) {
                        encodedPath = evu0.Q("/", encodedPath);
                    }
                    builder.appendEncodedPath(encodedPath);
                }
            }
            String encodedQuery = parse.getEncodedQuery();
            if (encodedQuery != null && encodedQuery.length() != 0) {
                Uri build2 = builder.build();
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                builder.clearQuery();
                for (String str : queryParameterNames) {
                    Iterator<T> it = parse.getQueryParameters(str).iterator();
                    while (it.hasNext()) {
                        builder.appendQueryParameter(str, (String) it.next());
                    }
                }
                for (String str2 : build2.getQueryParameterNames()) {
                    if (!queryParameterNames.contains(str2)) {
                        Iterator<T> it2 = build2.getQueryParameters(str2).iterator();
                        while (it2.hasNext()) {
                            builder.appendQueryParameter(str2, (String) it2.next());
                        }
                    }
                }
            }
            String encodedFragment = parse.getEncodedFragment();
            if (encodedFragment == null) {
                return;
            }
            builder.encodedFragment(encodedFragment);
        }
    }
}
