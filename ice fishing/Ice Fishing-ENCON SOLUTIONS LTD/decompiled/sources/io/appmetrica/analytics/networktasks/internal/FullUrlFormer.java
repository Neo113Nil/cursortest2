package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import io.appmetrica.analytics.networktasks.impl.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FullUrlFormer<T> {

    /* renamed from: a, reason: collision with root package name */
    private List f7485a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f7486b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f7487c;

    /* renamed from: d, reason: collision with root package name */
    private final IParamsAppender f7488d;

    /* renamed from: e, reason: collision with root package name */
    private final ConfigProvider f7489e;

    public FullUrlFormer(IParamsAppender<T> iParamsAppender, ConfigProvider<T> configProvider) {
        this.f7488d = iParamsAppender;
        this.f7489e = configProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void buildAndSetFullHostUrl() {
        Uri.Builder buildUpon = Uri.parse((String) this.f7485a.get(this.f7486b)).buildUpon();
        this.f7488d.appendParams(buildUpon, this.f7489e.getConfig());
        this.f7487c = buildUpon.build().toString();
    }

    public List<String> getAllHosts() {
        return this.f7485a;
    }

    public String getUrl() {
        return new c(this.f7487c).f7460a;
    }

    public boolean hasMoreHosts() {
        return this.f7486b + 1 < this.f7485a.size();
    }

    public void incrementAttemptNumber() {
        this.f7486b++;
    }

    public void setHosts(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f7485a = list;
    }
}
