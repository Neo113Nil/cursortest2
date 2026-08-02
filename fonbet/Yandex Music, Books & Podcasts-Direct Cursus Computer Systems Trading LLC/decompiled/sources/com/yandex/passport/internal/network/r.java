package com.yandex.passport.internal.network;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import com.yandex.passport.data.network.k5;
import defpackage.uah;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class r {
    public final Context a;
    public final com.yandex.passport.common.analytics.k b;
    public final com.yandex.passport.internal.helper.h c;
    public final com.yandex.passport.common.common.a d;
    public final Object e;
    public final Object f;

    public r(Context context, com.yandex.passport.common.analytics.k kVar, com.yandex.passport.internal.helper.h hVar, com.yandex.passport.common.common.a aVar) {
        context.getClass();
        kVar.getClass();
        hVar.getClass();
        aVar.getClass();
        this.a = context;
        this.b = kVar;
        this.c = hVar;
        this.d = aVar;
        final int i = 5;
        final int i2 = 6;
        final int i3 = 7;
        final int i4 = 0;
        this.e = uah.e(new Pair(CommonUrlParts.APP_PLATFORM, new k5(25)), new Pair(CommonUrlParts.APP_ID, new Function0(this) { // from class: com.yandex.passport.internal.network.q
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        r rVar = this.b;
                        com.yandex.passport.internal.helper.h hVar2 = rVar.c;
                        Configuration configuration = rVar.a.getResources().getConfiguration();
                        configuration.getClass();
                        hVar2.getClass();
                        String language = com.yandex.passport.internal.helper.h.a(configuration).getLanguage();
                        language.getClass();
                        return language;
                    case 1:
                        return ((com.yandex.passport.internal.common.d) this.b.d).a();
                    case 2:
                        return ((com.yandex.passport.internal.common.d) this.b.d).b();
                    case 3:
                        String d = this.b.b.d();
                        return d == null ? "" : d;
                    case 4:
                        r rVar2 = this.b;
                        com.yandex.passport.internal.helper.h hVar3 = rVar2.c;
                        Configuration configuration2 = rVar2.a.getResources().getConfiguration();
                        configuration2.getClass();
                        hVar3.getClass();
                        String language2 = com.yandex.passport.internal.helper.h.a(configuration2).getLanguage();
                        language2.getClass();
                        return language2;
                    case 5:
                        return ((com.yandex.passport.internal.common.d) this.b.d).a();
                    case 6:
                        return ((com.yandex.passport.internal.common.d) this.b.d).b();
                    default:
                        String d2 = this.b.b.d();
                        return d2 == null ? "" : d2;
                }
            }
        }), new Pair(CommonUrlParts.APP_VERSION, new Function0(this) { // from class: com.yandex.passport.internal.network.q
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        r rVar = this.b;
                        com.yandex.passport.internal.helper.h hVar2 = rVar.c;
                        Configuration configuration = rVar.a.getResources().getConfiguration();
                        configuration.getClass();
                        hVar2.getClass();
                        String language = com.yandex.passport.internal.helper.h.a(configuration).getLanguage();
                        language.getClass();
                        return language;
                    case 1:
                        return ((com.yandex.passport.internal.common.d) this.b.d).a();
                    case 2:
                        return ((com.yandex.passport.internal.common.d) this.b.d).b();
                    case 3:
                        String d = this.b.b.d();
                        return d == null ? "" : d;
                    case 4:
                        r rVar2 = this.b;
                        com.yandex.passport.internal.helper.h hVar3 = rVar2.c;
                        Configuration configuration2 = rVar2.a.getResources().getConfiguration();
                        configuration2.getClass();
                        hVar3.getClass();
                        String language2 = com.yandex.passport.internal.helper.h.a(configuration2).getLanguage();
                        language2.getClass();
                        return language2;
                    case 5:
                        return ((com.yandex.passport.internal.common.d) this.b.d).a();
                    case 6:
                        return ((com.yandex.passport.internal.common.d) this.b.d).b();
                    default:
                        String d2 = this.b.b.d();
                        return d2 == null ? "" : d2;
                }
            }
        }), new Pair("am_version_name", new k5(27)), new Pair("device_id", new Function0(this) { // from class: com.yandex.passport.internal.network.q
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        r rVar = this.b;
                        com.yandex.passport.internal.helper.h hVar2 = rVar.c;
                        Configuration configuration = rVar.a.getResources().getConfiguration();
                        configuration.getClass();
                        hVar2.getClass();
                        String language = com.yandex.passport.internal.helper.h.a(configuration).getLanguage();
                        language.getClass();
                        return language;
                    case 1:
                        return ((com.yandex.passport.internal.common.d) this.b.d).a();
                    case 2:
                        return ((com.yandex.passport.internal.common.d) this.b.d).b();
                    case 3:
                        String d = this.b.b.d();
                        return d == null ? "" : d;
                    case 4:
                        r rVar2 = this.b;
                        com.yandex.passport.internal.helper.h hVar3 = rVar2.c;
                        Configuration configuration2 = rVar2.a.getResources().getConfiguration();
                        configuration2.getClass();
                        hVar3.getClass();
                        String language2 = com.yandex.passport.internal.helper.h.a(configuration2).getLanguage();
                        language2.getClass();
                        return language2;
                    case 5:
                        return ((com.yandex.passport.internal.common.d) this.b.d).a();
                    case 6:
                        return ((com.yandex.passport.internal.common.d) this.b.d).b();
                    default:
                        String d2 = this.b.b.d();
                        return d2 == null ? "" : d2;
                }
            }
        }), new Pair("theme", new k5(28)), new Pair("lang", new k5(26)), new Pair(CommonUrlParts.LOCALE, new Function0(this) { // from class: com.yandex.passport.internal.network.q
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        r rVar = this.b;
                        com.yandex.passport.internal.helper.h hVar2 = rVar.c;
                        Configuration configuration = rVar.a.getResources().getConfiguration();
                        configuration.getClass();
                        hVar2.getClass();
                        String language = com.yandex.passport.internal.helper.h.a(configuration).getLanguage();
                        language.getClass();
                        return language;
                    case 1:
                        return ((com.yandex.passport.internal.common.d) this.b.d).a();
                    case 2:
                        return ((com.yandex.passport.internal.common.d) this.b.d).b();
                    case 3:
                        String d = this.b.b.d();
                        return d == null ? "" : d;
                    case 4:
                        r rVar2 = this.b;
                        com.yandex.passport.internal.helper.h hVar3 = rVar2.c;
                        Configuration configuration2 = rVar2.a.getResources().getConfiguration();
                        configuration2.getClass();
                        hVar3.getClass();
                        String language2 = com.yandex.passport.internal.helper.h.a(configuration2).getLanguage();
                        language2.getClass();
                        return language2;
                    case 5:
                        return ((com.yandex.passport.internal.common.d) this.b.d).a();
                    case 6:
                        return ((com.yandex.passport.internal.common.d) this.b.d).b();
                    default:
                        String d2 = this.b.b.d();
                        return d2 == null ? "" : d2;
                }
            }
        }));
        final int i5 = 1;
        final int i6 = 2;
        final int i7 = 3;
        final int i8 = 4;
        this.f = uah.e(new Pair(CommonUrlParts.APP_PLATFORM, new k5(25)), new Pair(CommonUrlParts.APP_ID, new Function0(this) { // from class: com.yandex.passport.internal.network.q
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        r rVar = this.b;
                        com.yandex.passport.internal.helper.h hVar2 = rVar.c;
                        Configuration configuration = rVar.a.getResources().getConfiguration();
                        configuration.getClass();
                        hVar2.getClass();
                        String language = com.yandex.passport.internal.helper.h.a(configuration).getLanguage();
                        language.getClass();
                        return language;
                    case 1:
                        return ((com.yandex.passport.internal.common.d) this.b.d).a();
                    case 2:
                        return ((com.yandex.passport.internal.common.d) this.b.d).b();
                    case 3:
                        String d = this.b.b.d();
                        return d == null ? "" : d;
                    case 4:
                        r rVar2 = this.b;
                        com.yandex.passport.internal.helper.h hVar3 = rVar2.c;
                        Configuration configuration2 = rVar2.a.getResources().getConfiguration();
                        configuration2.getClass();
                        hVar3.getClass();
                        String language2 = com.yandex.passport.internal.helper.h.a(configuration2).getLanguage();
                        language2.getClass();
                        return language2;
                    case 5:
                        return ((com.yandex.passport.internal.common.d) this.b.d).a();
                    case 6:
                        return ((com.yandex.passport.internal.common.d) this.b.d).b();
                    default:
                        String d2 = this.b.b.d();
                        return d2 == null ? "" : d2;
                }
            }
        }), new Pair(CommonUrlParts.APP_VERSION, new Function0(this) { // from class: com.yandex.passport.internal.network.q
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        r rVar = this.b;
                        com.yandex.passport.internal.helper.h hVar2 = rVar.c;
                        Configuration configuration = rVar.a.getResources().getConfiguration();
                        configuration.getClass();
                        hVar2.getClass();
                        String language = com.yandex.passport.internal.helper.h.a(configuration).getLanguage();
                        language.getClass();
                        return language;
                    case 1:
                        return ((com.yandex.passport.internal.common.d) this.b.d).a();
                    case 2:
                        return ((com.yandex.passport.internal.common.d) this.b.d).b();
                    case 3:
                        String d = this.b.b.d();
                        return d == null ? "" : d;
                    case 4:
                        r rVar2 = this.b;
                        com.yandex.passport.internal.helper.h hVar3 = rVar2.c;
                        Configuration configuration2 = rVar2.a.getResources().getConfiguration();
                        configuration2.getClass();
                        hVar3.getClass();
                        String language2 = com.yandex.passport.internal.helper.h.a(configuration2).getLanguage();
                        language2.getClass();
                        return language2;
                    case 5:
                        return ((com.yandex.passport.internal.common.d) this.b.d).a();
                    case 6:
                        return ((com.yandex.passport.internal.common.d) this.b.d).b();
                    default:
                        String d2 = this.b.b.d();
                        return d2 == null ? "" : d2;
                }
            }
        }), new Pair("am_version_name", new k5(27)), new Pair("device_id", new Function0(this) { // from class: com.yandex.passport.internal.network.q
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        r rVar = this.b;
                        com.yandex.passport.internal.helper.h hVar2 = rVar.c;
                        Configuration configuration = rVar.a.getResources().getConfiguration();
                        configuration.getClass();
                        hVar2.getClass();
                        String language = com.yandex.passport.internal.helper.h.a(configuration).getLanguage();
                        language.getClass();
                        return language;
                    case 1:
                        return ((com.yandex.passport.internal.common.d) this.b.d).a();
                    case 2:
                        return ((com.yandex.passport.internal.common.d) this.b.d).b();
                    case 3:
                        String d = this.b.b.d();
                        return d == null ? "" : d;
                    case 4:
                        r rVar2 = this.b;
                        com.yandex.passport.internal.helper.h hVar3 = rVar2.c;
                        Configuration configuration2 = rVar2.a.getResources().getConfiguration();
                        configuration2.getClass();
                        hVar3.getClass();
                        String language2 = com.yandex.passport.internal.helper.h.a(configuration2).getLanguage();
                        language2.getClass();
                        return language2;
                    case 5:
                        return ((com.yandex.passport.internal.common.d) this.b.d).a();
                    case 6:
                        return ((com.yandex.passport.internal.common.d) this.b.d).b();
                    default:
                        String d2 = this.b.b.d();
                        return d2 == null ? "" : d2;
                }
            }
        }), new Pair("theme", new k5(28)), new Pair("lang", new k5(29)), new Pair(CommonUrlParts.LOCALE, new Function0(this) { // from class: com.yandex.passport.internal.network.q
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        r rVar = this.b;
                        com.yandex.passport.internal.helper.h hVar2 = rVar.c;
                        Configuration configuration = rVar.a.getResources().getConfiguration();
                        configuration.getClass();
                        hVar2.getClass();
                        String language = com.yandex.passport.internal.helper.h.a(configuration).getLanguage();
                        language.getClass();
                        return language;
                    case 1:
                        return ((com.yandex.passport.internal.common.d) this.b.d).a();
                    case 2:
                        return ((com.yandex.passport.internal.common.d) this.b.d).b();
                    case 3:
                        String d = this.b.b.d();
                        return d == null ? "" : d;
                    case 4:
                        r rVar2 = this.b;
                        com.yandex.passport.internal.helper.h hVar3 = rVar2.c;
                        Configuration configuration2 = rVar2.a.getResources().getConfiguration();
                        configuration2.getClass();
                        hVar3.getClass();
                        String language2 = com.yandex.passport.internal.helper.h.a(configuration2).getLanguage();
                        language2.getClass();
                        return language2;
                    case 5:
                        return ((com.yandex.passport.internal.common.d) this.b.d).a();
                    case 6:
                        return ((com.yandex.passport.internal.common.d) this.b.d).b();
                    default:
                        String d2 = this.b.b.d();
                        return d2 == null ? "" : d2;
                }
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    public final Uri a(long j, String str) {
        String str2;
        str.getClass();
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (!queryParameterNames.contains("uid")) {
            buildUpon.appendQueryParameter("uid", String.valueOf(j));
        }
        ?? r5 = this.e;
        Set keySet = r5.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (!queryParameterNames.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            Function0 function0 = (Function0) r5.get(str3);
            if (function0 != null && (str2 = (String) function0.invoke()) != null) {
                buildUpon.appendQueryParameter(str3, str2);
            }
        }
        Uri build = buildUpon.build();
        build.getClass();
        return build;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    public final Uri b(long j, String str) {
        String str2;
        str.getClass();
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (!queryParameterNames.contains("uid")) {
            buildUpon.appendQueryParameter("uid", String.valueOf(j));
        }
        ?? r5 = this.f;
        Set keySet = r5.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (!queryParameterNames.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            Function0 function0 = (Function0) r5.get(str3);
            if (function0 != null && (str2 = (String) function0.invoke()) != null) {
                buildUpon.appendQueryParameter(str3, str2);
            }
        }
        Uri build = buildUpon.build();
        build.getClass();
        return build;
    }
}
