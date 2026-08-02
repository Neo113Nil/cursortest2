package com.fillr.browsersdk.model;

import androidx.media3.decoder.SimpleDecoder;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes4.dex */
public final class FillrClientServerPipe extends Thread {
    public Socket client;
    public InputStream clientIn;
    public OutputStream clientOut;
    public volatile long lastDataFromClient;
    public volatile long lastDataFromServer;
    public Socket server;
    public InputStream serverIn;
    public OutputStream serverOut;

    public final void closeSockets() {
        Socket[] socketArr = {this.client, this.server};
        for (int i = 0; i < 2; i++) {
            try {
                socketArr[i].close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new SimpleDecoder.AnonymousClass1(this, 2).start();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = this.clientIn.read(bArr, 0, 1024);
                if (read == -1) {
                    return;
                }
                this.lastDataFromClient = System.currentTimeMillis();
                this.serverOut.write(bArr, 0, read);
                this.serverOut.flush();
            }
        } catch (Exception e) {
            e.getMessage();
            SVG svg = Fillr.getInstance().fillrConfig;
        } finally {
            closeSockets();
        }
    }
}
