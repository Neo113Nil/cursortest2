package ru.yandex.quasar.glagol.impl;

import defpackage.u68;
import defpackage.v68;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
class DiscoveryResultImpl implements u68 {
    private final Map<String, v68> results = new HashMap();

    private synchronized Map<String, v68> getMap() {
        return new HashMap(this.results);
    }

    public synchronized void addItem(String str, v68 v68Var) {
        this.results.put(str, v68Var);
    }

    public synchronized void clear() {
        this.results.clear();
    }

    public synchronized boolean contains(String str, v68 v68Var) {
        return v68Var.equals(this.results.get(str));
    }

    @Override // defpackage.u68
    public Collection<v68> getDiscoveredItems() {
        return new ArrayList(this.results.values());
    }

    public synchronized v68 removeItem(String str) {
        return this.results.remove(str);
    }

    public synchronized void replace(DiscoveryResultImpl discoveryResultImpl) {
        this.results.clear();
        this.results.putAll(discoveryResultImpl.getMap());
    }
}
