package com.yandex.plus.core.templating.parser;

import defpackage.ge4;
import defpackage.wop;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class a {
    public static final a a = new a();
    public static final LinkedHashSet b;
    public static final LinkedHashSet c;

    static {
        LinkedHashSet j = wop.j(wop.i(CollectionsKt.A0(new ge4('a', 'z')), CollectionsKt.A0(new ge4('A', 'Z'))), '_');
        b = j;
        c = wop.j(wop.i(j, CollectionsKt.A0(new ge4('0', '9'))), '.');
    }
}
