package e;

import android.os.Parcelable;
import f.AbstractC4511a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class h extends AbstractC4468c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f37196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37197b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC4511a f37198c;

    public h(i iVar, String str, AbstractC4511a abstractC4511a) {
        this.f37196a = iVar;
        this.f37197b = str;
        this.f37198c = abstractC4511a;
    }

    public final void a(Object obj) {
        i iVar = this.f37196a;
        LinkedHashMap linkedHashMap = iVar.f37200b;
        String str = this.f37197b;
        Object obj2 = linkedHashMap.get(str);
        AbstractC4511a abstractC4511a = this.f37198c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC4511a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int intValue = ((Number) obj2).intValue();
        ArrayList arrayList = iVar.f37202d;
        arrayList.add(str);
        try {
            iVar.b(intValue, abstractC4511a, (Parcelable) obj);
        } catch (Exception e9) {
            arrayList.remove(str);
            throw e9;
        }
    }
}
