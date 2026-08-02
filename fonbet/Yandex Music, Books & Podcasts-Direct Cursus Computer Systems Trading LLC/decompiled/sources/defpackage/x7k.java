package defpackage;

import kotlin.text.Regex;

/* loaded from: classes5.dex */
public abstract class x7k {
    public static final Regex a = new Regex("^Serializer for class '(.+)' is not found\\..*");
    public static final Regex b = new Regex("Serializer for subclass '([^']+)' is not found(?: in the polymorphic scope of '([^']+)')?");
    public static final Regex c = new Regex("^Field '(.+)' is required for type with serial name '(.+)'.*");
}
