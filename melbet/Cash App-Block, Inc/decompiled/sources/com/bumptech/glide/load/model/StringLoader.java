package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.net.URL;

/* loaded from: classes4.dex */
public final class StringLoader implements ModelLoader {
    public final /* synthetic */ int $r8$classId;
    public final ModelLoader uriLoader;

    public /* synthetic */ StringLoader(ModelLoader modelLoader, int i) {
        this.$r8$classId = i;
        this.uriLoader = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData buildLoadData(Object obj, int i, int i2, Options options) {
        Uri fromFile;
        int i3 = this.$r8$classId;
        ModelLoader modelLoader = this.uriLoader;
        switch (i3) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    fromFile = null;
                } else if (str.charAt(0) == '/') {
                    fromFile = Uri.fromFile(new File(str));
                } else {
                    Uri parse = Uri.parse(str);
                    fromFile = parse.getScheme() == null ? Uri.fromFile(new File(str)) : parse;
                }
                if (fromFile == null || !modelLoader.handles(fromFile)) {
                    return null;
                }
                return modelLoader.buildLoadData(fromFile, i, i2, options);
            default:
                return modelLoader.buildLoadData(new GlideUrl((URL) obj), i, i2, options);
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final /* bridge */ /* synthetic */ boolean handles(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
