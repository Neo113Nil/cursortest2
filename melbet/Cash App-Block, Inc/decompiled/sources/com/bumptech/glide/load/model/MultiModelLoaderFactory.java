package com.bumptech.glide.load.model;

import com.bumptech.glide.Registry;
import com.caverock.androidsvg.SVG;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class MultiModelLoaderFactory {
    public static final ByteBufferEncoder DEFAULT_FACTORY = new ByteBufferEncoder(10);
    public static final UnitModelLoader EMPTY_MODEL_LOADER = new UnitModelLoader(2);
    public final SVG throwableListPool;
    public final ArrayList entries = new ArrayList();
    public final HashSet alreadyUsedEntries = new HashSet();
    public final ByteBufferEncoder factory = DEFAULT_FACTORY;

    public final class Entry {
        public final Class dataClass;
        public final ModelLoaderFactory factory;
        public final Class modelClass;

        public Entry(Class cls, Class cls2, ModelLoaderFactory modelLoaderFactory) {
            this.modelClass = cls;
            this.dataClass = cls2;
            this.factory = modelLoaderFactory;
        }
    }

    public MultiModelLoaderFactory(SVG svg) {
        this.throwableListPool = svg;
    }

    public final synchronized ModelLoader build(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.entries.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (this.alreadyUsedEntries.contains(entry)) {
                    z = true;
                } else if (entry.modelClass.isAssignableFrom(cls) && entry.dataClass.isAssignableFrom(cls2)) {
                    this.alreadyUsedEntries.add(entry);
                    arrayList.add(entry.factory.build(this));
                    this.alreadyUsedEntries.remove(entry);
                }
            }
            if (arrayList.size() > 1) {
                ByteBufferEncoder byteBufferEncoder = this.factory;
                SVG svg = this.throwableListPool;
                byteBufferEncoder.getClass();
                return new AssetUriLoader(2, arrayList, svg);
            }
            if (arrayList.size() == 1) {
                return (ModelLoader) arrayList.get(0);
            }
            if (z) {
                return EMPTY_MODEL_LOADER;
            }
            throw new Registry.NoModelLoaderAvailableException("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.alreadyUsedEntries.clear();
            throw th;
        }
    }

    public final synchronized ArrayList getDataClasses(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.entries.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (!arrayList.contains(entry.dataClass) && entry.modelClass.isAssignableFrom(cls)) {
                arrayList.add(entry.dataClass);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList build(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.entries.iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (!this.alreadyUsedEntries.contains(entry) && entry.modelClass.isAssignableFrom(cls)) {
                    this.alreadyUsedEntries.add(entry);
                    arrayList.add(entry.factory.build(this));
                    this.alreadyUsedEntries.remove(entry);
                }
            }
        } finally {
        }
        return arrayList;
    }
}
