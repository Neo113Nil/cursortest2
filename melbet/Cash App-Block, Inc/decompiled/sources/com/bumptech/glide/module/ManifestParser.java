package com.bumptech.glide.module;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.clientroutes.ClientRoute;
import java.lang.reflect.InvocationTargetException;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class ManifestParser {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewLocalBrandBrowser.deepLinkSpecs;
    }

    public static void parseModule(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException(Boxes$$ExternalSyntheticOutline1.m("Expected instanceof GlideModule, but found: ", cls.getDeclaredConstructor(null).newInstance(null)));
            } catch (IllegalAccessException e) {
                throwInstantiateGlideModuleException(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                throwInstantiateGlideModuleException(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                throwInstantiateGlideModuleException(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                throwInstantiateGlideModuleException(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static void throwInstantiateGlideModuleException(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(Boxes$$ExternalSyntheticOutline1.m(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }
}
