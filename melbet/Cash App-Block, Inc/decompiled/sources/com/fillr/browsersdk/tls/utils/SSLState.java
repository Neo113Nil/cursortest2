package com.fillr.browsersdk.tls.utils;

import java.security.SecureRandom;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class SSLState {
    public byte[] clientMacKey;
    public byte[] clientWriteKey;
    public final String hostname;
    public byte[] serverMacKey;
    public byte[] serverWriteKey;
    public int versionHigh;
    public int versionLow;
    public int clientSequenceNumber = 0;
    public int serverSequenceNumber = 0;
    public final SecureRandom random = new SecureRandom(UUID.randomUUID().toString().getBytes());
    public final byte[] iv = new byte[16];

    public SSLState(String str, int i) {
        this.hostname = str;
    }

    public final synchronized void addClientPackets(int i) {
        this.clientSequenceNumber += i;
    }

    public final synchronized void addServerPackets() {
        this.serverSequenceNumber++;
    }
}
