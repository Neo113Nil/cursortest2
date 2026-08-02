package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.ek6;
import defpackage.uif;
import defpackage.whp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import ru.kinopoisk.network.cookiejar.SerializableCookie;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class N0 extends uif implements Function0<Set<O4>> {
    public final /* synthetic */ M0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(M0 m0) {
        super(0);
        this.a = m0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Set<Map.Entry<String, ?>> entrySet = this.a.a.a.getAll().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            ek6 ek6Var = null;
            if (value instanceof String) {
                try {
                    SerializableCookie.Companion.getClass();
                    ek6Var = whp.a((String) value);
                } catch (C1131m2 e) {
                    Timber.INSTANCE.tag("CookiePersistor").w(e, "Failed to deserialize cookie: ignoring | entry = \"%s\"", entry);
                }
            } else {
                Timber.INSTANCE.tag("CookiePersistor").w("Failed to deserialize cookie (non-string input): ignoring | entry = \"%s\"", entry);
            }
            if (ek6Var != null) {
                arrayList.add(ek6Var);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(new O4((ek6) it2.next()));
        }
        return linkedHashSet;
    }
}
