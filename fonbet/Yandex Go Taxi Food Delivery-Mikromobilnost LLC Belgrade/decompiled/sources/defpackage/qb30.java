package defpackage;

import kotlin.text.Regex;

/* loaded from: classes12.dex */
public abstract class qb30 {
    public static final Regex a = new Regex("^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$");
    public static final Regex b = new Regex("^[\\w\\d+=/]+$");
}
