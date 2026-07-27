package e;

import android.os.Parcelable;
import f.AbstractC4485a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class h extends AbstractC4464c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f37219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC4485a f37221c;

    public h(i iVar, String str, AbstractC4485a abstractC4485a) {
        this.f37219a = iVar;
        this.f37220b = str;
        this.f37221c = abstractC4485a;
    }

    public final void a(Object obj) {
        i iVar = this.f37219a;
        LinkedHashMap linkedHashMap = iVar.f37223b;
        String str = this.f37220b;
        Object obj2 = linkedHashMap.get(str);
        AbstractC4485a abstractC4485a = this.f37221c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC4485a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int intValue = ((Number) obj2).intValue();
        ArrayList arrayList = iVar.f37225d;
        arrayList.add(str);
        try {
            iVar.b(intValue, abstractC4485a, (Parcelable) obj);
        } catch (Exception e6) {
            arrayList.remove(str);
            throw e6;
        }
    }
}
