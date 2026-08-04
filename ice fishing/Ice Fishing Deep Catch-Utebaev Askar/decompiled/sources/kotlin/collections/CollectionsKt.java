package kotlin.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    public static Object f(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        if (!(set instanceof List)) {
            Iterator it = set.iterator();
            if (it.hasNext()) {
                return it.next();
            }
            throw new NoSuchElementException("Collection is empty.");
        }
        List list = (List) set;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static String g(Iterable iterable, String separator, String prefix, String postfix, Function1 function1, int i2) {
        if ((i2 & 1) != 0) {
            separator = ", ";
        }
        if ((i2 & 2) != 0) {
            prefix = "";
        }
        if ((i2 & 4) != 0) {
            postfix = "";
        }
        int i3 = 0;
        int i4 = (i2 & 8) != 0 ? -1 : 0;
        String truncated = (i2 & 16) != 0 ? "..." : null;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append((CharSequence) prefix);
        for (Object obj : iterable) {
            i3++;
            if (i3 > 1) {
                buffer.append((CharSequence) separator);
            }
            if (i4 >= 0 && i3 > i4) {
                break;
            }
            kotlin.text.h.a(buffer, obj, function1);
        }
        if (i4 >= 0 && i3 > i4) {
            buffer.append((CharSequence) truncated);
        }
        buffer.append((CharSequence) postfix);
        String string = buffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static Set h(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return z.f179a;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(c0.a(arrayList.size()));
            CollectionsKt___CollectionsKt.e(arrayList, linkedHashSet);
            return linkedHashSet;
        }
        Set setSingleton = Collections.singleton(arrayList.get(0));
        Intrinsics.checkNotNullExpressionValue(setSingleton, "singleton(element)");
        return setSingleton;
    }
}
