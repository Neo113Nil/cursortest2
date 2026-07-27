package com.giderosmobile.android.player;

import java.util.HashSet;

/* compiled from: GGMediaPlayerManager.java */
/* loaded from: classes.dex */
class Sound {
    public HashSet<Channel> channels = new HashSet<>();
    public String fileName;
    public int length;
    public int zipFile;

    public Sound(String str, int i) {
        this.fileName = str;
        this.length = i;
    }
}
