package defpackage;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class j5i {
    public final int a;
    public final /* synthetic */ int b;
    public final Context c;
    public final Gson d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j5i(Context context, Gson gson, int i) {
        this(1);
        this.b = i;
        switch (i) {
            case 1:
                this(2);
                this.c = context;
                this.d = gson;
                break;
            default:
                this.c = context;
                this.d = gson;
                break;
        }
    }

    public final void a(String str) {
        jxb jxbVar;
        switch (this.b) {
            case 0:
                Gson gson = this.d;
                Context context = this.c;
                str.getClass();
                try {
                    File filesDir = context.getFilesDir();
                    filesDir.getClass();
                    File file = new File(new File(filesDir, "experiments"), "main_".concat(str));
                    File filesDir2 = context.getFilesDir();
                    filesDir2.getClass();
                    File file2 = new File(new File(new File(filesDir2, "experiments2"), str), "main.txt");
                    if (file.exists()) {
                        cbc.i(file, file2, true, 4);
                    }
                    File filesDir3 = context.getFilesDir();
                    filesDir3.getClass();
                    File file3 = new File(new File(filesDir3, "experiments"), "details_".concat(str));
                    if (file3.exists()) {
                        List<kxb> E = new qdc(18, file3, gson).E();
                        ArrayList arrayList = new ArrayList(v75.o(E, 10));
                        for (kxb kxbVar : E) {
                            arrayList.add(new Pair(kxbVar.a, new jxb(kxbVar.b)));
                        }
                        Map n = uah.n(arrayList);
                        File filesDir4 = context.getFilesDir();
                        filesDir4.getClass();
                        new nnk(new File(new File(new File(filesDir4, "experiments2"), str), "details.txt"), gson).L(n);
                        break;
                    }
                } catch (IOException e) {
                    ssg.a(6, null, "Migration from old experiments failed with IOException", e);
                    return;
                }
                break;
            default:
                Context context2 = this.c;
                str.getClass();
                try {
                    File filesDir5 = context2.getFilesDir();
                    filesDir5.getClass();
                    File file4 = new File(new File(new File(filesDir5, "experiments2"), str), "main.txt");
                    if (!file4.exists()) {
                        file4 = null;
                    }
                    if (file4 != null) {
                        h4b h4bVar = new h4b(file4);
                        File filesDir6 = context2.getFilesDir();
                        filesDir6.getClass();
                        File file5 = new File(new File(new File(filesDir6, "experiments2"), str), "details.txt");
                        if (!file5.exists()) {
                            file5 = null;
                        }
                        if (file5 != null) {
                            nnk nnkVar = new nnk(file5, this.d);
                            LinkedHashMap W = h4bVar.W();
                            Map J = nnkVar.J();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(J.size()));
                            for (Object obj : J.entrySet()) {
                                Object key = ((Map.Entry) obj).getKey();
                                Map.Entry entry = (Map.Entry) obj;
                                String str2 = (String) W.get(entry.getKey());
                                if (str2 != null) {
                                    JsonObject jsonObject = ((jxb) entry.getValue()).a;
                                    jsonObject.getClass();
                                    JsonElement v = jsonObject.v(str2);
                                    if (v != null) {
                                        jxbVar = new jxb(v.m());
                                        linkedHashMap.put(key, jxbVar);
                                    }
                                }
                                jxbVar = null;
                                linkedHashMap.put(key, jxbVar);
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                Object value = entry2.getValue();
                                if (value != null) {
                                    linkedHashMap2.put(entry2.getKey(), value);
                                }
                            }
                            nnkVar.L(linkedHashMap2);
                            break;
                        }
                    }
                } catch (IOException e2) {
                    ssg.a(6, null, "Migration from old experiments failed with IOException", e2);
                }
                break;
        }
    }

    public j5i(int i) {
        this.a = i;
    }
}
