package defpackage;

import java.util.TimeZone;
import kotlin.text.Regex;

/* loaded from: classes4.dex */
public abstract class z2k0 {
    public static final TimeZone a = TimeZone.getTimeZone("GMT");
    public static final Regex b = new Regex("^(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
}
