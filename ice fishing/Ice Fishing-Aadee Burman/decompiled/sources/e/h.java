package e;

import android.os.Parcelable;
import f.AbstractC4494a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class h extends AbstractC4457c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f37088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC4494a f37090c;

    public h(i iVar, String str, AbstractC4494a abstractC4494a) {
        this.f37088a = iVar;
        this.f37089b = str;
        this.f37090c = abstractC4494a;
    }

    public final void a(Object obj) {
        i iVar = this.f37088a;
        LinkedHashMap linkedHashMap = iVar.f37092b;
        String str = this.f37089b;
        Object obj2 = linkedHashMap.get(str);
        AbstractC4494a abstractC4494a = this.f37090c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC4494a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int intValue = ((Number) obj2).intValue();
        ArrayList arrayList = iVar.f37094d;
        arrayList.add(str);
        try {
            iVar.b(intValue, abstractC4494a, (Parcelable) obj);
        } catch (Exception e9) {
            arrayList.remove(str);
            throw e9;
        }
    }
}
