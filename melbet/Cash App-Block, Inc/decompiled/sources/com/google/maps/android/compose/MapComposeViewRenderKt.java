package com.google.maps.android.compose;

import android.content.Context;
import android.database.Cursor;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.maps.MapView;
import com.google.android.libraries.places.internal.zzcha;
import com.squareup.cash.R;
import com.squareup.cash.integration.contacts.RealContactBookKt$maybeGetInt$1;
import com.squareup.cash.integration.contacts.RealContactBookKt$maybeGetString$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.ConvertFromMetadataKt;
import kotlin.reflect.jvm.internal.KTypeParameterImpl;
import kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl;
import kotlin.reflect.jvm.internal.StandardKTypes;
import kotlin.reflect.jvm.internal.TypeParameterTable;
import kotlin.reflect.jvm.internal.impl.km.Attributes;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmTypeParameter;

/* loaded from: classes9.dex */
public abstract class MapComposeViewRenderKt {
    public static final Integer access$maybeGetColumnIndex(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1) {
            return null;
        }
        return Integer.valueOf(columnIndex);
    }

    public static final Integer access$maybeGetInt(Cursor cursor, Integer num) {
        Object invoke;
        RealContactBookKt$maybeGetInt$1 realContactBookKt$maybeGetInt$1 = RealContactBookKt$maybeGetInt$1.INSTANCE;
        if (num != null) {
            try {
                invoke = realContactBookKt$maybeGetInt$1.invoke(cursor, Integer.valueOf(num.intValue()));
            } catch (Exception unused) {
            }
            return (Integer) invoke;
        }
        invoke = null;
        return (Integer) invoke;
    }

    public static final String access$maybeGetString(Cursor cursor, Integer num) {
        Object invoke;
        RealContactBookKt$maybeGetString$1 realContactBookKt$maybeGetString$1 = RealContactBookKt$maybeGetString$1.INSTANCE;
        if (num != null) {
            try {
                invoke = realContactBookKt$maybeGetString$1.invoke(cursor, Integer.valueOf(num.intValue()));
            } catch (Exception unused) {
            }
            return (String) invoke;
        }
        invoke = null;
        return (String) invoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    public static TypeParameterTable create(List list, TypeParameterTable typeParameterTable, KTypeParameterOwnerImpl kTypeParameterOwnerImpl, ClassLoader classLoader) {
        list.getClass();
        classLoader.getClass();
        List<KmTypeParameter> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (KmTypeParameter kmTypeParameter : list2) {
            String name = kmTypeParameter.getName();
            KVariance kVariance = ConvertFromMetadataKt.toKVariance(kmTypeParameter.getVariance());
            Attributes.isReified(kmTypeParameter);
            arrayList.add(new KTypeParameterImpl(kTypeParameterOwnerImpl, name, kVariance));
        }
        IndexingIterable withIndex = CollectionsKt.withIndex(list2);
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(withIndex, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator it = withIndex.iterator();
        while (true) {
            ArrayIterator arrayIterator = (ArrayIterator) it;
            if (!((Iterator) arrayIterator.f1520array).hasNext()) {
                break;
            }
            IndexedValue indexedValue = (IndexedValue) arrayIterator.next();
            linkedHashMap.put(Integer.valueOf(((KmTypeParameter) indexedValue.value).getId()), arrayList.get(indexedValue.index));
        }
        TypeParameterTable typeParameterTable2 = new TypeParameterTable(arrayList, linkedHashMap, typeParameterTable);
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            int i2 = i + 1;
            KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) it2.next();
            List<KmType> upperBounds = ((KmTypeParameter) list.get(i)).getUpperBounds();
            ?? arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(upperBounds, 10));
            Iterator it3 = upperBounds.iterator();
            while (it3.hasNext()) {
                arrayList2.add(ConvertFromMetadataKt.toKType((KmType) it3.next(), classLoader, typeParameterTable2, null));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = CollectionsKt__CollectionsJVMKt.listOf(StandardKTypes.NULLABLE_ANY);
            }
            List list3 = (List) arrayList2;
            kTypeParameterImpl.getClass();
            list3.getClass();
            kTypeParameterImpl.upperBounds = list3;
            i = i2;
        }
        return typeParameterTable2;
    }

    public static void renderComposeViewOnce$default(MapView mapView, ComposeView composeView, CompositionContext compositionContext) {
        mapView.getClass();
        compositionContext.getClass();
        startRenderingComposeView(mapView, composeView, compositionContext).close();
    }

    public static final zzcha startRenderingComposeView(MapView mapView, AbstractComposeView abstractComposeView, CompositionContext compositionContext) {
        mapView.getClass();
        compositionContext.getClass();
        NoDrawContainerView noDrawContainerView = (NoDrawContainerView) mapView.findViewById(R.id.maps_compose_nodraw_container_view);
        if (noDrawContainerView == null) {
            Context context = mapView.getContext();
            context.getClass();
            noDrawContainerView = new NoDrawContainerView(context);
            noDrawContainerView.setId(R.id.maps_compose_nodraw_container_view);
            mapView.addView(noDrawContainerView);
        }
        noDrawContainerView.addView(abstractComposeView);
        abstractComposeView.setParentCompositionContext(compositionContext);
        return new zzcha(noDrawContainerView, abstractComposeView, 2);
    }
}
