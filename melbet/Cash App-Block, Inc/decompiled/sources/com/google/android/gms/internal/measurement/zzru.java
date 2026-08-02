package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public final class zzru {
    public final HashMap zza;
    public final HashMap zzb;
    public final ArrayList zzc;

    public zzru(ArrayList arrayList) {
        List list = Collections.EMPTY_LIST;
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzsx zzsxVar = (zzsx) it.next();
            if (TextUtils.isEmpty(zzsxVar.zzc())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                zzsx zzsxVar2 = (zzsx) this.zza.put(zzsxVar.zzc(), zzsxVar);
                if (zzsxVar2 != null) {
                    String canonicalName = zzsxVar2.getClass().getCanonicalName();
                    String canonicalName2 = zzsxVar.getClass().getCanonicalName();
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length()), "Cannot override Backend ", canonicalName, " with ", canonicalName2));
                    throw null;
                }
            }
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it2);
        }
        this.zzc.addAll(list);
    }

    public final Object zza(Uri uri, zzrt zzrtVar) {
        return zzrtVar.zza(zze(uri));
    }

    public final zzzm zze(Uri uri) {
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableList.Builder builder2 = ImmutableList.builder();
        String encodedFragment = uri.getEncodedFragment();
        List copyOf = (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) ? RegularImmutableList.EMPTY : ImmutableList.copyOf(Splitter.on(Marker.ANY_NON_NULL_MARKER).omitEmptyStrings().split(encodedFragment.substring(10)));
        int size = copyOf.size();
        for (int i = 0; i < size; i++) {
            String str = (String) copyOf.get(i);
            Matcher matcher = zzsp.zza.matcher(str);
            if (!matcher.matches()) {
                a$$ExternalSyntheticBUOutline0.m$3("Invalid fragment spec: ".concat(String.valueOf(str)));
                return null;
            }
            builder2.m2032add((Object) matcher.group(1));
        }
        RegularImmutableList build = builder2.build();
        if (build.size > 0) {
            String str2 = (String) build.get(0);
            if (this.zzb.get(str2) != null) {
                a$$ExternalSyntheticBUOutline0.m$1();
                return null;
            }
            String valueOf = String.valueOf(uri);
            throw new zzsk(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(str2.length() + 40 + valueOf.length()), "Requested transform isn't registered: ", str2, ": ", valueOf));
        }
        ImmutableList reverse = builder.build().reverse();
        ComponentRegistry.Builder builder3 = new ComponentRegistry.Builder();
        String scheme = uri.getScheme();
        zzsx zzsxVar = (zzsx) this.zza.get(scheme);
        if (zzsxVar == null) {
            throw new zzsk(Recorder$$ExternalSyntheticOutline2.m("Requested backend isn't registered: ", scheme));
        }
        builder3.mappers = zzsxVar;
        builder3.interceptors = this.zzc;
        builder3.keyers = reverse;
        builder3.lazyFetcherFactories = uri;
        if (!reverse.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str3 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = reverse.listIterator(reverse.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous() != null) {
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    }
                }
                arrayList.set(arrayList.size() - 1, str3);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        builder3.lazyDecoderFactories = uri;
        return new zzzm(builder3);
    }
}
