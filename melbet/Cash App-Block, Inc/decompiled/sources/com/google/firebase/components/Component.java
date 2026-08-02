package com.google.firebase.components;

import androidx.core.os.BundleKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class Component {
    public final Set dependencies;
    public final ComponentFactory factory;
    public final int instantiation;
    public final String name;
    public final Set providedInterfaces;
    public final Set publishedEvents;

    /* renamed from: type, reason: collision with root package name */
    public final int f1003type;

    public Component(String str, Set set, Set set2, int i, int i2, ComponentFactory componentFactory, Set set3) {
        this.name = str;
        this.providedInterfaces = Collections.unmodifiableSet(set);
        this.dependencies = Collections.unmodifiableSet(set2);
        this.instantiation = i;
        this.f1003type = i2;
        this.factory = componentFactory;
        this.publishedEvents = Collections.unmodifiableSet(set3);
    }

    public static Builder builder(Class cls) {
        return new Builder(cls, new Class[0]);
    }

    public static Component of(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(Qualified.unqualified(cls));
        for (Class cls2 : clsArr) {
            BundleKt.checkNotNull(cls2, "Null interface");
            hashSet.add(Qualified.unqualified(cls2));
        }
        return new Component(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new Component$$ExternalSyntheticLambda0(obj, 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.providedInterfaces.toArray()) + ">{" + this.instantiation + ", type=" + this.f1003type + ", deps=" + Arrays.toString(this.dependencies.toArray()) + "}";
    }

    public static Builder builder(Qualified qualified) {
        return new Builder(qualified, new Qualified[0]);
    }

    public final class Builder {
        public final HashSet dependencies;
        public ComponentFactory factory;
        public int instantiation;
        public String name = null;
        public final HashSet providedInterfaces;
        public final HashSet publishedEvents;

        /* renamed from: type, reason: collision with root package name */
        public int f1004type;

        public Builder(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.providedInterfaces = hashSet;
            this.dependencies = new HashSet();
            this.instantiation = 0;
            this.f1004type = 0;
            this.publishedEvents = new HashSet();
            hashSet.add(Qualified.unqualified(cls));
            for (Class cls2 : clsArr) {
                BundleKt.checkNotNull(cls2, "Null interface");
                this.providedInterfaces.add(Qualified.unqualified(cls2));
            }
        }

        public final void add(Dependency dependency) {
            if (this.providedInterfaces.contains(dependency.anInterface)) {
                a$$ExternalSyntheticBUOutline0.m$3("Components are not allowed to depend on interfaces they themselves provide.");
            } else {
                this.dependencies.add(dependency);
            }
        }

        public final Component build() {
            if (this.factory != null) {
                return new Component(this.name, new HashSet(this.providedInterfaces), new HashSet(this.dependencies), this.instantiation, this.f1004type, this.factory, this.publishedEvents);
            }
            a$$ExternalSyntheticBUOutline0.m$1("Missing required property: factory.");
            return null;
        }

        public Builder(Qualified qualified, Qualified[] qualifiedArr) {
            HashSet hashSet = new HashSet();
            this.providedInterfaces = hashSet;
            this.dependencies = new HashSet();
            this.instantiation = 0;
            this.f1004type = 0;
            this.publishedEvents = new HashSet();
            hashSet.add(qualified);
            for (Qualified qualified2 : qualifiedArr) {
                BundleKt.checkNotNull(qualified2, "Null interface");
            }
            Collections.addAll(this.providedInterfaces, qualifiedArr);
        }
    }
}
