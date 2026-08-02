package ru.CryptoPro.AdES;

import java.util.Collection;
import java.util.Collections;

/* loaded from: classes4.dex */
public abstract class AbstractFinder<T> {
    protected final Collection<T> collection;
    protected String provider;

    public AbstractFinder(Collection<T> collection) {
        this.collection = collection == null ? Collections.EMPTY_LIST : Collections.unmodifiableCollection(collection);
    }

    public void setProvider(String str) {
        this.provider = str;
    }
}
