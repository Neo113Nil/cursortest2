package o;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public Context f8228a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f8229b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f8230c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f8231d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f8232e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f8233f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f8234g;

    /* renamed from: h, reason: collision with root package name */
    public int f8235h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8236i;

    /* renamed from: j, reason: collision with root package name */
    public b f8237j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8238k;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f8239l;

    /* renamed from: m, reason: collision with root package name */
    public String f8240m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8241n;

    /* renamed from: o, reason: collision with root package name */
    public Notification f8242o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f8243p;

    public static CharSequence a(String str) {
        return str == null ? str : str.length() > 5120 ? str.subSequence(0, 5120) : str;
    }

    public final void b(b bVar) {
        if (this.f8237j != bVar) {
            this.f8237j = bVar;
            if (((c) bVar.f8226b) != this) {
                bVar.f8226b = this;
                b(bVar);
            }
        }
    }
}
