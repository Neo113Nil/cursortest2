package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.SingletonImmutableSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzabe {
    public static final ImmutableSet zza = ImmutableSet.of((Object) "applet", (Object) "base", (Object) "embed", (Object) "math", (Object) "meta", (Object) "object", (Object[]) new String[]{"svg", "template"});
    public static final SingletonImmutableSet zzb = new SingletonImmutableSet("script");
    public static final SingletonImmutableSet zzc = new SingletonImmutableSet("style");
    public static final ImmutableSet zzd = ImmutableSet.of((Object) "area", (Object) "br", (Object) "col", (Object) "hr", (Object) "img", (Object) "input", (Object[]) new String[]{"link", "param", "source", "track", "wbr"});
    public static final ImmutableSet zzh;
    public static final ImmutableSet zzi;
    public final String zze;
    public final LinkedHashMap zzf = new LinkedHashMap();
    public final ArrayList zzg = new ArrayList();

    static {
        ImmutableSet.of("input");
        ImmutableSet.of("form");
        ImmutableSet.of("script");
        ImmutableSet.of((Object) "button", (Object) "input");
        ImmutableSet.of((Object) "button", (Object) "input");
        zzh = ImmutableSet.of((Object) "a", (Object) "area");
        zzi = ImmutableSet.of((Object) "alternate", (Object) "author", (Object) "bookmark", (Object) "canonical", (Object) "cite", (Object) "help", (Object[]) new String[]{"icon", "license", "next", "prefetch", "dns-prefetch", "prerender", "preconnect", "preload", "prev", "search", "subresource"});
        ImmutableSet.of("form");
        ImmutableSet.of("input");
        ImmutableSet.of((Object) "input", (Object) "textarea");
        ImmutableSet.construct(5, "audio", "img", "input", "source", "video");
        ImmutableSet.of("iframe");
    }

    public zzabe() {
        if (!"a".matches("[a-z0-9-]+")) {
            a$$ExternalSyntheticBUOutline0.m$3("Invalid element name \"a\". Only lowercase letters, numbers and '-' allowed.");
            throw null;
        }
        if (zza.contains("a")) {
            a$$ExternalSyntheticBUOutline0.m$3("Element \"a\" is not supported.");
            throw null;
        }
        this.zze = "a";
    }

    public final void zza(zzabg zzabgVar) {
        String str;
        ImmutableSet immutableSet = zzh;
        String str2 = this.zze;
        if (!immutableSet.contains(str2) && !str2.equals("link")) {
            a$$ExternalSyntheticBUOutline0.m$3("Attribute \"href\" with a SafeUrl value can only be used by one of the following elements: ".concat(String.valueOf(immutableSet)));
            return;
        }
        boolean equals = str2.equals("link");
        LinkedHashMap linkedHashMap = this.zzf;
        if (equals && (str = (String) linkedHashMap.get("rel")) != null) {
            if (!zzi.contains(str.toLowerCase(Locale.ENGLISH))) {
                a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(str.length() + 113), "SafeUrl values for the href attribute are not allowed on <link rel=", str, ">. Did you intend to use a TrustedResourceUrl?"));
                return;
            }
        }
        String str3 = zzabgVar.zzb;
        Sniffer sniffer = zzabb.zzb;
        linkedHashMap.put("href", zzwr.zzb(str3));
    }

    public final void zzb(String str) {
        Sniffer sniffer = zzabb.zzb;
        Iterator it = Arrays.asList(new zzabd(zzabb.zza(zzwr.zzb(str)))).iterator();
        ImmutableSet immutableSet = zzd;
        String str2 = this.zze;
        Trace.checkState("Element \"%s\" is a void element and so cannot have content.", str2, !immutableSet.contains(str2));
        Trace.checkState("Element \"%s\" requires SafeScript contents, not SafeHTML or text.", str2, !zzb.element.equals(str2));
        Trace.checkState("Element \"%s\" requires SafeStyleSheet contents, not SafeHTML or text.", str2, !zzc.element.equals(str2));
        while (it.hasNext()) {
            this.zzg.add(((zzabd) it.next()).zza);
        }
    }

    public final zzabd zzc() {
        StringBuilder sb = new StringBuilder("<");
        String str = this.zze;
        sb.append(str);
        for (Map.Entry entry : this.zzf.entrySet()) {
            sb.append(" ");
            sb.append((String) entry.getKey());
            sb.append("=\"");
            sb.append(zzabb.zza((String) entry.getValue()));
            sb.append("\"");
        }
        boolean contains = zzd.contains(str);
        sb.append(">");
        if (!contains) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            sb.append("</");
            sb.append(str);
            sb.append(">");
        }
        return new zzabd(sb.toString());
    }
}
